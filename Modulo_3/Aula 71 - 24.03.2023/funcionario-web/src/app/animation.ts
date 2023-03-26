import { AnimationMetadata, animate, query, style, transition, trigger } from '@angular/animations';

const arrayPassosAnimacaoFade: Array<AnimationMetadata> = [
    query(':enter', [style({ opacity: 0 }), animate('0.3s', style({ opacity: 1 }))], { optional: true }),
    query(':leave', [style({ opacity: 1 }), animate('0.3s', style({ opacity: 0 }))], { optional: true })
];

export const fadeAnimation = trigger('fadeAnimation', [transition('* => fade', arrayPassosAnimacaoFade)]);
