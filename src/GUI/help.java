/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author pavox20
 */
public class help extends javax.swing.JFrame {

    /**
     * Creates new form help
     */
    public help() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hi user :)\n\n*Important* Please watch the Python file. As you can see there is a DB load. This DB is required to predict good values. \n\nThis program just uses numbers as input data.\n\nIn order to set good values, caracteristics like 'Modelname', 'Transmssion', 'Engine fuel' and 'Body type' have to be set as numbers.\nThe trafuction of each caracteristics to numbers are:\n\nModel name:\n{'100': 0, '1007': 1, '100NX': 2, '106': 3, '107': 4, '11': 5, '110': 6, '111': 7, '1111': 8, '1119': 9, '112': 10, '116': 11, '118': 12, '12': 13, '120': 14, '121': 15, '125': 16, '1300': 17, '145': 18, '146': 19, '147': 20, '1500': 21, '155': 22, '156': 23, '159': 24, '164': 25, '166': 26, '180': 27, '19': 28, '190': 29, '2': 30, '200': 31, '200-Series': 32, '2008': 33, '200SX': 34, '205': 35, '206': 36, '207': 37, '208': 38, '21': 39, '2101': 40, '21011': 41, '21013': 42, '2102': 43, '2103': 44, '2104': 45, '2105': 46, '2106': 47, '2107': 48, '2108': 49, '2109': 50, '21099': 51, '2110': 52, '2111': 53, '2112': 54, '2113': 55, '2114': 56, '2115': 57, '2120': 58, '2121': 59, '21213': 60, '21214': 61, '2123': 62, '2125': 63, '2131': 64, '2140': 65, '2141': 66, '216': 67, '218': 68, '220': 69, '2206': 70, '235': 71, '24': 72, '240': 73, '2401': 74, '2402': 75, '2410': 76, '244': 77, '25': 78, '264': 79, '2705': 80, '2752': 81, '3': 82, '3-sep': 83, '300': 84, '3000GT': 85, '3008': 86, '301': 87, '306': 88, '307': 89, '308': 90, '309': 91, '3102': 92, '310210': 93, '310221': 94, '31029': 95, '3110': 96, '31105': 97, '315': 98, '3151': 99, '31512': 100, '31514': 101, '316': 102, '318': 103, '320': 104, '322': 105, '3221': 106, '322132': 107, '322133': 108, '323': 109, '3234': 110, '324': 111, '325': 112, '328': 113, '330': 114, '3302': 115, '3303': 116, '335': 117, '340': 118, '3500': 119, '350Z': 120, '360': 121, '3741': 122, '39099': 123, '3962': 124, '400': 125, '400-Series': 126, '4007': 127, '4008': 128, '401': 129, '402': 130, '403': 131, '405': 132, '406': 133, '407': 134, '408': 135, '410': 136, '412': 137, '420': 138, '428': 139, '435': 140, '440': 141, '45': 142, '451': 143, '452': 144, '460': 145, '469': 146, '4Runner': 147, '4x4': 148, '5': 149, '5-sep': 150, '500': 151, '5008': 152, '500L': 153, '500X': 154, '508': 155, '518': 156, '520': 157, '523': 158, '524': 159, '525': 160, '528': 161, '530': 162, '535': 163, '539': 164, '540': 165, '545': 166, '550': 167, '6': 168, '600-Series': 169, '605': 170, '607': 171, '620': 172, '626': 173, '630': 174, '635': 175, '640': 176, '645': 177, '650': 178, '69': 179, '725': 180, '728': 181, '730': 182, '732': 183, '735': 184, '740': 185, '745': 186, '75': 187, '750': 188, '760': 189, '80': 190, '800-Series': 191, '806': 192, '807': 193, '850': 194, '9 - 7X': 195, '9-2X': 196, '90': 197, '900': 198, '9000': 199, '929': 200, '940': 201, '960': 202, '965': 203, '966': 204, '968м': 205, 'A1': 206, 'A13': 207, 'A140': 208, 'A150': 209, 'A160': 210, 'A170': 211, 'A180': 212, 'A190': 213, 'A2': 214, 'A200': 215, 'A210': 216, 'A3': 217, 'A4': 218, 'A4 Allroad': 219, 'A5': 220, 'A6': 221, 'A6 Allroad': 222, 'A7': 223, 'A8': 224, 'AMG GT4': 225, 'ASX': 226, 'AX': 227, 'Accent': 228, 'Accord': 229, 'Actyon': 230, 'Aerio': 231, 'Aerodeck': 232, 'Aerostar': 233, 'Agila': 234, 'Albea': 235, 'Alero': 236, 'Alhambra': 237, 'Almera': 238, 'Almera Tino': 239, 'Alphard': 240, 'Altea': 241, 'Altima': 242, 'Alto': 243, 'Amarok': 244, 'Amulet': 245, 'Antara': 246, 'Armada': 247, 'Arosa': 248, 'Ascona': 249, 'Astra': 250, 'Astro Van': 251, 'Atlas': 252, 'Atos': 253, 'Auris': 254, 'Avella': 255, 'Avenger': 256, 'Avensis': 257, 'Avensis Verso': 258, 'Aveo': 259, 'Aygo': 260, 'Aztek': 261, 'B-Max': 262, 'B160': 263, 'B170': 264, 'B180': 265, 'B200': 266, 'BX': 267, 'Baleno': 268, 'Beetle': 269, 'Berlingo': 270, 'Besta': 271, 'Bipper': 272, 'Bipper Tepee': 273, 'Blazer': 274, 'Bluebird': 275, 'Bora': 276, 'Boxer': 277, 'Boxster': 278, 'Brava': 279, 'Bravo': 280, 'Breez': 281, 'Brera': 282, 'C-Crosser': 283, 'C-ELYSÉE': 284, 'C-Max': 285, 'C1': 286, 'C1500': 287, 'C180': 288, 'C2': 289, 'C200': 290, 'C220': 291, 'C230': 292, 'C240': 293, 'C25': 294, 'C250': 295, 'C270': 296, 'C280': 297, 'C3': 298, 'C3 Picasso': 299, 'C30': 300, 'C300': 301, 'C320': 302, 'C4': 303, 'C4 AirCross': 304, 'C4 Grand Picasso': 305, 'C4 Picasso': 306, 'C5': 307, 'C6': 308, 'C63AMG': 309, 'C70': 310, 'C8': 311, 'CK': 312, 'CL': 313, 'CL420': 314, 'CL500': 315, 'CL550': 316, 'CLA180': 317, 'CLA200': 318, 'CLA220': 319, 'CLA250': 320, 'CLA45 AMG': 321, 'CLK200': 322, 'CLK230': 323, 'CLK270': 324, 'CLK320': 325, 'CLS250': 326, 'CLS320': 327, 'CLS350': 328, 'CLS400': 329, 'CLS500': 330, 'CLS55 AMG': 331, 'CLS550': 332, 'CR-V': 333, 'CR-Z': 334, 'CT': 335, 'CTS': 336, 'CX': 337, 'CX-5': 338, 'CX-7': 339, 'CX-9': 340, 'Cabstar': 341, 'Caddy': 342, 'Caliber': 343, 'Calibra': 344, 'Camaro': 345, 'Campo': 346, 'Camry': 347, 'Captiva': 348, 'Captur': 349, 'Caravan': 350, 'Carens': 351, 'Carina E': 352, 'Carina II': 353, 'Carisma': 354, 'Carnival': 355, 'Catera': 356, 'Cavalier': 357, 'Cayenne': 358, 'Cebrium': 359, \"Cee'd\": 360, 'Celica': 361, 'Cerato': 362, 'Challenger': 363, 'Chance': 364, 'Charger': 365, 'Chaser': 366, 'Cherokee': 367, 'Cinquecento': 368, 'Cirrus': 369, 'Citan': 370, 'Citigo': 371, 'City': 372, 'Civic': 373, 'Clarus': 374, 'Clio': 375, 'Clubman': 376, 'Colorado': 377, 'Colt': 378, 'Combo': 379, 'Commander': 380, 'Commodore': 381, 'Compass': 382, 'Concerto': 383, 'Concorde': 384, 'Continental': 385, 'Contour': 386, 'Cooper': 387, 'Cooper S': 388, 'Cordoba': 389, 'Corolla': 390, 'Corolla Verso': 391, 'Corrado': 392, 'Corsa': 393, 'Cougar': 394, 'Countryman': 395, 'Coupe': 396, 'Courier': 397, 'Crafter': 398, 'Creta': 399, 'Croma': 400, 'Crosstour': 401, 'Crown': 402, 'Crown Victoria': 403, 'Cruze': 404, 'DS4': 405, 'DS5': 406, 'Daily': 407, 'Dakota': 408, 'Dart': 409, 'De Ville': 410, 'Dedra': 411, 'Deer': 412, 'Defender': 413, 'Delta': 414, 'Demio': 415, 'Discovery': 416, 'Discovery Sport': 417, 'Doblo': 418, 'Dokker': 419, 'Ducato': 420, 'Durango': 421, 'Duster': 422, 'E200': 423, 'E220': 424, 'E2200': 425, 'E230': 426, 'E240': 427, 'E250': 428, 'E260': 429, 'E270': 430, 'E280': 431, 'E290': 432, 'E300': 433, 'E320': 434, 'E350': 435, 'E400': 436, 'E420': 437, 'E430': 438, 'E450': 439, 'E500': 440, 'E63 AMG': 441, 'EC7': 442, 'ELR': 443, 'ES': 444, 'EX': 445, 'EX7': 446, 'Echo': 447, 'Eclipse': 448, 'Eclipse Cross': 449, 'EcoSport': 450, 'Econoline': 451, 'Edge': 452, 'Elantra': 453, 'Eldorado': 454, 'Element': 455, 'Elysion': 456, 'Emgrand': 457, 'Emgrand 7': 458, 'Enclave': 459, 'Encore': 460, 'Endeavor': 461, 'Eos': 462, 'Epica': 463, 'Equinox': 464, 'Escalade': 465, 'Escape': 466, 'Escort': 467, 'Espace': 468, 'Espero': 469, 'Evasion': 470, 'Excursion': 471, 'Expedition': 472, 'Expert': 473, 'Expert Tepee': 474, 'Explorer': 475, 'Express': 476, 'F-Pace': 477, 'F-Type': 478, 'F150': 479, 'F250': 480, 'FJ Cruiser': 481, 'FR-V': 482, 'FX': 483, 'Fabia': 484, 'Favorit': 485, 'Felicia': 486, 'Fiesta': 487, 'Fiorino': 488, 'Firebird': 489, 'Fit': 490, 'Florid': 491, 'Fluence': 492, 'Focus': 493, 'Fora': 494, 'Forenza': 495, 'Forester': 496, 'Forza': 497, 'Fox': 498, 'Freelander': 499, 'Freemont': 500, 'Freestyle': 501, 'Frontera': 502, 'Fusion': 503, 'G': 504, 'G270': 505, 'G300': 506, 'G320': 507, 'G400': 508, 'G500': 509, 'G55 AMG': 510, 'G6': 511, 'GL320': 512, 'GL350': 513, 'GL400': 514, 'GL420': 515, 'GL450': 516, 'GL500': 517, 'GL550': 518, 'GL63': 519, 'GLA200': 520, 'GLC250': 521, 'GLC300': 522, 'GLE300': 523, 'GLE350': 524, 'GLK220': 525, 'GLK300': 526, 'GLK350': 527, 'GS': 528, 'GT': 529, 'GTV': 530, 'GX': 531, 'Galant': 532, 'Galaxy': 533, 'Galloper': 534, 'Genesis': 535, 'Gentra': 536, 'Getz': 537, 'Giulietta': 538, 'Gol': 539, 'Golf': 540, 'Golf Plus': 541, 'Gran Turismo': 542, 'Granada': 543, 'Grand Am': 544, 'Grand C-Max': 545, 'Grand Caravan': 546, 'Grand Cherokee': 547, 'Grand Espace': 548, 'Grand Modus': 549, 'Grand Scenic': 550, 'Grand Starex': 551, 'Grand Vitara': 552, 'Grand Voyager': 553, 'Grande Punto': 554, 'Grandeur': 555, 'Grandis': 556, 'Grandland X': 557, 'Granta': 558, 'H 100': 559, 'H-1': 560, 'H3': 561, 'H5': 562, 'H6': 563, 'HHR': 564, 'HR-V': 565, 'Hd': 566, 'HiAce': 567, 'Highlander': 568, 'Hilux': 569, 'Hover': 570, 'Hunter': 571, 'I': 572, 'ILX': 573, 'IQ': 574, 'IS': 575, 'Ibiza': 576, 'Idea': 577, 'Ignis': 578, 'Impala': 579, 'Impreza': 580, 'Insight': 581, 'Insignia': 582, 'Integra': 583, 'Interstar': 584, 'Intrepid': 585, 'J5': 586, 'JX': 587, 'Jazz': 588, 'Jetta': 589, 'Jimny': 590, 'John Cooper Works': 591, 'Joice': 592, 'Journey': 593, 'Juke': 594, 'Jumper': 595, 'Jumpy': 596, 'Justy': 597, 'Ka': 598, 'Kadett': 599, 'Kadjar': 600, 'Kalina': 601, 'Kalos': 602, 'Kangoo': 603, 'Kapitan': 604, 'Kappa': 605, 'Kaptur': 606, 'Kimo': 607, 'Kodiaq': 608, 'Koleos': 609, 'Korando': 610, 'Kuga': 611, 'Kyron': 612, 'L200': 613, 'L300': 614, 'L400': 615, 'L50': 616, 'LC': 617, 'LHS': 618, 'LS': 619, 'LT': 620, 'LX': 621, 'Lacetti': 622, 'Laguna': 623, 'Lancer': 624, 'Lancer Evolution': 625, 'Lancia': 626, 'Land Cruiser': 627, 'Lanos': 628, 'Lantra': 629, 'Largus': 630, 'Latitude': 631, 'Le Baron': 632, 'LeMans': 633, 'Legacy': 634, 'Leganza': 635, 'Legend': 636, 'Leon': 637, 'Liana': 638, 'Libero': 639, 'Liberty': 640, 'Linea': 641, 'Lodgy': 642, 'Logan': 643, 'Logo': 644, 'Lumina': 645, 'Lupo': 646, 'Lybra': 647, 'M': 648, 'M3': 649, 'M4': 650, 'M6': 651, 'MB100': 652, 'MDX': 653, 'MK': 654, 'MKC': 655, 'MKX': 656, 'MKZ': 657, 'ML230': 658, 'ML250': 659, 'ML270': 660, 'ML280': 661, 'ML300': 662, 'ML320': 663, 'ML350': 664, 'ML400': 665, 'ML430': 666, 'ML500': 667, 'ML55 AMG': 668, 'ML550': 669, 'ML63 AMG': 670, 'MPV': 671, 'MX-3': 672, 'MX-6': 673, 'Macan': 674, 'Magentis': 675, 'Magnum': 676, 'Malaga': 677, 'Malibu': 678, 'Manager': 679, 'Marea': 680, 'Mark VIII': 681, 'Mascott': 682, 'Master': 683, 'Matiz': 684, 'Matrix': 685, 'Maverick': 686, 'Maxima': 687, 'Maxity': 688, 'Megane': 689, 'Megane Scenic': 690, 'Meriva': 691, 'Micra': 692, 'Mii': 693, 'Millenia': 694, 'Mirage': 695, 'Model F': 696, 'Modus': 697, 'Mohave': 698, 'Mokka': 699, 'Mondeo': 700, 'Monterey': 701, 'Montero': 702, 'Monza': 703, 'Movano': 704, 'Multipla': 705, 'Murano': 706, 'Musa': 707, 'Musso': 708, 'Mustang': 709, 'MyWay': 710, 'NV S': 711, 'NV200': 712, 'NX': 713, 'Navara': 714, 'Navigator': 715, 'Nemo': 716, 'Neon': 717, 'Nexia': 718, 'Nitro': 719, 'Niva': 720, 'Note': 721, 'Nubira': 722, 'Octavia': 723, 'Odyssey': 724, 'Omega': 725, 'One': 726, 'Optima': 727, 'Orion': 728, 'Orlando': 729, 'Outback': 730, 'Outlander': 731, 'PT Cruiser': 732, 'Paceman': 733, 'Pacifica': 734, 'Pajero': 735, 'Pajero Pinin': 736, 'Pajero Sport': 737, 'Palio': 738, 'Panamera': 739, 'Panda': 740, 'Partner': 741, 'Partner Tepee': 742, 'Paseo': 743, 'Passat': 744, 'Passat CC': 745, 'Passport': 746, 'Pathfinder': 747, 'Patriot': 748, 'Patrol': 749, 'Pegasus': 750, 'Peri': 751, 'Phaeton': 752, 'Phedra': 753, 'Picanto': 754, 'Picnic': 755, 'Pilot': 756, 'Pixo': 757, 'Pointer': 758, 'Polo': 759, 'Polo Sedan': 760, 'Pony': 761, 'Prairie': 762, 'Pregio': 763, 'Prelude': 764, 'Premacy': 765, 'Previa': 766, 'Pride': 767, 'Primastar': 768, 'Primera': 769, 'Priora': 770, 'Prius': 771, 'Probe': 772, 'Protege': 773, 'Pulsar': 774, 'Puma': 775, 'Punto': 776, 'Q': 777, 'Q3': 778, 'Q5': 779, 'Q7': 780, 'QQ': 781, 'QQ6': 782, 'QX': 783, 'Qashqai': 784, 'Qashqai+2': 785, 'Quest': 786, 'Quoris': 787, 'R280': 788, 'R320': 789, 'R350': 790, 'R500': 791, 'RAV4': 792, 'RDX': 793, 'RL': 794, 'RS6': 795, 'RSX': 796, 'RVR': 797, 'RX': 798, 'RX-8': 799, 'Ram': 800, 'Range Rover': 801, 'Range Rover Evoque': 802, 'Range Rover Sport': 803, 'Ranger': 804, 'Rapid': 805, 'Regal': 806, 'Rekord': 807, 'Renegade': 808, 'Retona': 809, 'Rexton': 810, 'Rezzo': 811, 'Ridgeline': 812, 'Rio': 813, 'Rodius': 814, 'Rogue': 815, 'Roomster': 816, 'S-Coupe': 817, 'S-Max': 818, 'S-Type': 819, 'S1000': 820, 'S220': 821, 'S300': 822, 'S320': 823, 'S350': 824, 'S4': 825, 'S40': 826, 'S400': 827, 'S420': 828, 'S430': 829, 'S450': 830, 'S5': 831, 'S500': 832, 'S550': 833, 'S560': 834, 'S6': 835, 'S60': 836, 'S600': 837, 'S63 AMG': 838, 'S65 AMG': 839, 'S70': 840, 'S8': 841, 'S80': 842, 'S90': 843, 'SC': 844, 'SC7': 845, 'SL320': 846, 'SL350': 847, 'SL500': 848, 'SLX': 849, 'SRX': 850, 'STS': 851, 'SX4': 852, 'SX4 S-Cross': 853, 'Safe': 854, 'Safrane': 855, 'Samurai': 856, 'Sandero': 857, 'Santa Fe': 858, 'Santamo': 859, 'Santana': 860, 'Saxo': 861, 'Scenic': 862, 'Scirocco': 863, 'Scorpio': 864, 'Scudo': 865, 'Sebring': 866, 'Sedona': 867, 'Seicento': 868, 'Sens': 869, 'Sentra': 870, 'Sephia': 871, 'Sequoia': 872, 'Serena': 873, 'Seville': 874, 'Sharan': 875, 'Shuma': 876, 'Shuttle': 877, 'Siena': 878, 'Sienna': 879, 'Sierra': 880, 'Sigma': 881, 'Signum': 882, 'Silverado': 883, 'Sintra': 884, 'Skyline': 885, 'Smily': 886, 'Solano': 887, 'Solara': 888, 'Solaris': 889, 'Sonata': 890, 'Sorento': 891, 'Soul': 892, 'Space Gear': 893, 'Space Runner': 894, 'Space Star': 895, 'Space Wagon': 896, 'Spark': 897, 'Spectra': 898, 'Spider': 899, 'Splash': 900, 'Sportage': 901, 'Sprinter': 902, 'Starex': 903, 'Starlet': 904, 'Stavic': 905, 'Stealth': 906, 'Stilo': 907, 'Stratus': 908, 'Stream': 909, 'Streetwise': 910, 'Suburban': 911, 'Sunny': 912, 'Superb': 913, 'Supra': 914, 'Swift': 915, 'Symbol': 916, 'T1': 917, 'T2': 918, 'T3': 919, 'T3 Caravelle': 920, 'T3 Multivan': 921, 'T4': 922, 'T4 Caravelle': 923, 'T4 Multivan': 924, 'T5': 925, 'T5 Caravelle': 926, 'T5 Multivan': 927, 'T5 Shuttle': 928, 'T6': 929, 'T6 Caravelle': 930, 'T6 Multivan': 931, 'TL': 932, 'TSX': 933, 'TT': 934, 'Tacoma': 935, 'Tacuma': 936, 'Tahoe': 937, 'Talisman': 938, 'Taunus': 939, 'Taurus': 940, 'Teana': 941, 'Tempo': 942, 'Tempra': 943, 'Terracan': 944, 'Terrano': 945, 'Thalia': 946, 'Thema': 947, 'Thesis': 948, 'Thunderbird': 949, 'Tiburon': 950, 'Tiggo': 951, 'Tigra': 952, 'Tiguan': 953, 'Tiida': 954, 'Tipo': 955, 'Titan': 956, 'Toledo': 957, 'Touareg': 958, 'Touran': 959, 'Tourneo': 960, 'Tourneo Custom': 961, 'Town Car': 962, 'Town&Country': 963, 'Tracker': 964, 'Trafic': 965, 'Trail Blazer': 966, 'Trajet': 967, 'Trans Sport': 968, 'Transit': 969, 'Trax': 970, 'Tribeca': 971, 'Tribute': 972, 'Tucson': 973, 'Tundra': 974, 'Twingo': 975, 'Ulysse': 976, 'Uno': 977, 'Up': 978, 'Urban Cruiser': 979, 'Urvan': 980, 'V220': 981, 'V250': 982, 'V40': 983, 'V50': 984, 'V60': 985, 'V70': 986, 'V8': 987, 'V90': 988, 'Van': 989, 'Vaneo': 990, 'Vanette': 991, 'Vario': 992, 'Vectra': 993, 'Vel Satis': 994, 'Venga': 995, 'Vento': 996, 'Venture': 997, 'Venza': 998, 'Verona': 999, 'Versa': 1000, 'Verso': 1001, 'Vesta': 1002, 'Viano': 1003, 'Vibe': 1004, 'Vision': 1005, 'Vitara': 1006, 'Vito': 1007, 'Vivaro': 1008, 'Volt': 1009, 'Voyager': 1010, 'WRX': 1011, 'Wagon R': 1012, 'Windstar': 1013, 'Wrangler': 1014, 'X-Trail': 1015, 'X-Type': 1016, 'X1': 1017, 'X2': 1018, 'X3': 1019, 'X4': 1020, 'X5': 1021, 'X5 M': 1022, 'X50': 1023, 'X6': 1024, 'X6 M': 1025, 'X60': 1026, 'X70': 1027, 'XC60': 1028, 'XC70': 1029, 'XC90': 1030, 'XE': 1031, 'XF': 1032, 'XG 30': 1033, 'XJ': 1034, 'XKR': 1035, 'XL7': 1036, 'XM': 1037, 'XRAY': 1038, 'XV': 1039, 'Xantia': 1040, 'Xedos 6': 1041, 'Xedos 9': 1042, 'Xsara': 1043, 'Xsara Picasso': 1044, 'Yaris': 1045, 'Yeti': 1046, 'Ypsilon': 1047, 'Z3': 1048, 'Z4': 1049, 'ZDX': 1050, 'ZX': 1051, 'Zafira': 1052, 'Zeta': 1053, 'i10': 1054, 'i20': 1055, 'i30': 1056, 'i40': 1057, 'ix35': 1058, 'ix55': 1059, 'А21': 1060, 'А22': 1061, 'ВИС': 1062, 'Луидор': 1063, 'М20': 1064, 'М5': 1065, 'Соболь': 1066, 'Таврия': 1067}\n\nTransmission:\n{'all': 0, 'front': 1, 'rear': 2}\n\nEngine type:\n{'diesel': 0, 'gas': 1, 'gasoline': 2, 'hybrid-diesel': 3, 'hybrid-petrol': 4}\n\nBody type:\n{'cabriolet': 0, 'coupe': 1, 'hatchback': 2, 'liftback': 3, 'limousine': 4, 'minibus': 5, 'minivan': 6, 'pickup': 7, 'sedan': 8, 'suv': 9, 'universal': 10, 'van': 11}\n\n\n*Recomendation*\n-Use the complete path in each part, in Java and in the Python file.\n-Copy it in a text file to search each model name.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
