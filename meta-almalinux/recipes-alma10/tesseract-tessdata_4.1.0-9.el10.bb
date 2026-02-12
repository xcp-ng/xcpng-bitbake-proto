
inherit dnf-bridge

PN = "tesseract-tessdata"
PE = "0"
PV = "4.1.0"
PR = "9.el10"
PACKAGES = "tesseract-langpack-afr tesseract-langpack-amh tesseract-langpack-ara tesseract-langpack-asm tesseract-langpack-aze tesseract-langpack-aze_cyrl tesseract-langpack-bel tesseract-langpack-ben tesseract-langpack-bod tesseract-langpack-bos tesseract-langpack-bre tesseract-langpack-bul tesseract-langpack-cat tesseract-langpack-ceb tesseract-langpack-ces tesseract-langpack-chi_sim tesseract-langpack-chi_sim_vert tesseract-langpack-chi_tra tesseract-langpack-chi_tra_vert tesseract-langpack-chr tesseract-langpack-cos tesseract-langpack-cym tesseract-langpack-dan tesseract-langpack-deu tesseract-langpack-div tesseract-langpack-dzo tesseract-langpack-ell tesseract-langpack-eng tesseract-langpack-enm tesseract-langpack-epo tesseract-langpack-est tesseract-langpack-eus tesseract-langpack-fao tesseract-langpack-fas tesseract-langpack-fil tesseract-langpack-fin tesseract-langpack-fra tesseract-langpack-frk tesseract-langpack-frm tesseract-langpack-fry tesseract-langpack-gla tesseract-langpack-gle tesseract-langpack-glg tesseract-langpack-grc tesseract-langpack-guj tesseract-langpack-hat tesseract-langpack-heb tesseract-langpack-hin tesseract-langpack-hrv tesseract-langpack-hun tesseract-langpack-hye tesseract-langpack-iku tesseract-langpack-ind tesseract-langpack-isl tesseract-langpack-ita tesseract-langpack-ita_old tesseract-langpack-jav tesseract-langpack-jpn tesseract-langpack-jpn_vert tesseract-langpack-kan tesseract-langpack-kat tesseract-langpack-kat_old tesseract-langpack-kaz tesseract-langpack-khm tesseract-langpack-kir tesseract-langpack-kmr tesseract-langpack-kor tesseract-langpack-kor_vert tesseract-langpack-lao tesseract-langpack-lat tesseract-langpack-lav tesseract-langpack-lit tesseract-langpack-ltz tesseract-langpack-mal tesseract-langpack-mar tesseract-langpack-mkd tesseract-langpack-mlt tesseract-langpack-mon tesseract-langpack-mri tesseract-langpack-msa tesseract-langpack-mya tesseract-langpack-nep tesseract-langpack-nld tesseract-langpack-nor tesseract-langpack-oci tesseract-langpack-ori tesseract-langpack-pan tesseract-langpack-pol tesseract-langpack-por tesseract-langpack-pus tesseract-langpack-que tesseract-langpack-ron tesseract-langpack-rus tesseract-langpack-san tesseract-langpack-sin tesseract-langpack-slk tesseract-langpack-slv tesseract-langpack-snd tesseract-langpack-spa tesseract-langpack-spa_old tesseract-langpack-sqi tesseract-langpack-srp tesseract-langpack-srp_latn tesseract-langpack-sun tesseract-langpack-swa tesseract-langpack-swe tesseract-langpack-syr tesseract-langpack-tam tesseract-langpack-tat tesseract-langpack-tel tesseract-langpack-tgk tesseract-langpack-tha tesseract-langpack-tir tesseract-langpack-ton tesseract-langpack-tur tesseract-langpack-uig tesseract-langpack-ukr tesseract-langpack-urd tesseract-langpack-uzb tesseract-langpack-uzb_cyrl tesseract-langpack-vie tesseract-langpack-yid tesseract-langpack-yor tesseract-tessdata-doc tesseract-equ tesseract-osd tesseract-script-arabic tesseract-script-armenian tesseract-script-bengali tesseract-script-canadian_aboriginal tesseract-script-cherokee tesseract-script-cyrillic tesseract-script-devanagari tesseract-script-ethiopic tesseract-script-fraktur tesseract-script-georgian tesseract-script-greek tesseract-script-gujarati tesseract-script-gurmukhi tesseract-script-hangul tesseract-script-hangul_vert tesseract-script-hans tesseract-script-hans_vert tesseract-script-hant tesseract-script-hant_vert tesseract-script-hebrew tesseract-script-japanese tesseract-script-japanese_vert tesseract-script-kannada tesseract-script-khmer tesseract-script-lao tesseract-script-latin tesseract-script-malayalam tesseract-script-myanmar tesseract-script-oriya tesseract-script-sinhala tesseract-script-syriac tesseract-script-tamil tesseract-script-telugu tesseract-script-thaana tesseract-script-thai tesseract-script-tibetan tesseract-script-vietnamese"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tesseract-tessdata-4.1.0-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tesseract-langpack-afr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-afr-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-afr}"
RDEPENDS:tesseract-langpack-afr = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-amh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-amh-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-amh}"
RDEPENDS:tesseract-langpack-amh = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ara = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ara-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ara}"
RDEPENDS:tesseract-langpack-ara = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-asm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-asm-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-asm}"
RDEPENDS:tesseract-langpack-asm = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-aze = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-aze-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-aze}"
RDEPENDS:tesseract-langpack-aze = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-aze_cyrl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-aze_cyrl-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-aze_cyrl}"
RDEPENDS:tesseract-langpack-aze_cyrl = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-bel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-bel-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-bel}"
RDEPENDS:tesseract-langpack-bel = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ben = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ben-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ben}"
RDEPENDS:tesseract-langpack-ben = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-bod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-bod-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-bod}"
RDEPENDS:tesseract-langpack-bod = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-bos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-bos-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-bos}"
RDEPENDS:tesseract-langpack-bos = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-bre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-bre-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-bre}"
RDEPENDS:tesseract-langpack-bre = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-bul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-bul-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-bul}"
RDEPENDS:tesseract-langpack-bul = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-cat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-cat-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-cat}"
RDEPENDS:tesseract-langpack-cat = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ceb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ceb-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ceb}"
RDEPENDS:tesseract-langpack-ceb = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ces-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ces}"
RDEPENDS:tesseract-langpack-ces = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-chi_sim = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-chi_sim-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-chi_sim}"
RDEPENDS:tesseract-langpack-chi_sim = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-chi_sim_vert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-chi_sim_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-chi_sim_vert}"
RDEPENDS:tesseract-langpack-chi_sim_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-chi_tra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-chi_tra-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-chi_tra}"
RDEPENDS:tesseract-langpack-chi_tra = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-chi_tra_vert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-chi_tra_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-chi_tra_vert}"
RDEPENDS:tesseract-langpack-chi_tra_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-chr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-chr-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-chr}"
RDEPENDS:tesseract-langpack-chr = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-cos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-cos-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-cos}"
RDEPENDS:tesseract-langpack-cos = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-cym = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-cym-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-cym}"
RDEPENDS:tesseract-langpack-cym = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-dan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-dan-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-dan}"
RDEPENDS:tesseract-langpack-dan = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-deu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-deu-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-deu}"
RDEPENDS:tesseract-langpack-deu = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-div = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-div-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-div}"
RDEPENDS:tesseract-langpack-div = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-dzo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-dzo-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-dzo}"
RDEPENDS:tesseract-langpack-dzo = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ell = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ell-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ell}"
RDEPENDS:tesseract-langpack-ell = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-eng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-eng-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-eng}"
RDEPENDS:tesseract-langpack-eng = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-enm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-enm-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-enm}"
RDEPENDS:tesseract-langpack-enm = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-epo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-epo-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-epo}"
RDEPENDS:tesseract-langpack-epo = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-est = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-est-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-est}"
RDEPENDS:tesseract-langpack-est = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-eus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-eus-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-eus}"
RDEPENDS:tesseract-langpack-eus = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fao = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fao-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fao}"
RDEPENDS:tesseract-langpack-fao = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fas-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fas}"
RDEPENDS:tesseract-langpack-fas = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fil-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fil}"
RDEPENDS:tesseract-langpack-fil = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fin-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fin}"
RDEPENDS:tesseract-langpack-fin = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fra-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fra}"
RDEPENDS:tesseract-langpack-fra = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-frk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-frk-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-frk}"
RDEPENDS:tesseract-langpack-frk = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-frm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-frm-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-frm}"
RDEPENDS:tesseract-langpack-frm = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-fry = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-fry-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-fry}"
RDEPENDS:tesseract-langpack-fry = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-gla = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-gla-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-gla}"
RDEPENDS:tesseract-langpack-gla = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-gle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-gle-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-gle}"
RDEPENDS:tesseract-langpack-gle = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-glg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-glg-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-glg}"
RDEPENDS:tesseract-langpack-glg = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-grc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-grc-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-grc}"
RDEPENDS:tesseract-langpack-grc = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-guj = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-guj-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-guj}"
RDEPENDS:tesseract-langpack-guj = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-hat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-hat-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-hat}"
RDEPENDS:tesseract-langpack-hat = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-heb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-heb-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-heb}"
RDEPENDS:tesseract-langpack-heb = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-hin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-hin-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-hin}"
RDEPENDS:tesseract-langpack-hin = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-hrv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-hrv-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-hrv}"
RDEPENDS:tesseract-langpack-hrv = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-hun = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-hun-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-hun}"
RDEPENDS:tesseract-langpack-hun = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-hye = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-hye-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-hye}"
RDEPENDS:tesseract-langpack-hye = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-iku = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-iku-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-iku}"
RDEPENDS:tesseract-langpack-iku = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ind = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ind-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ind}"
RDEPENDS:tesseract-langpack-ind = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-isl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-isl-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-isl}"
RDEPENDS:tesseract-langpack-isl = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ita = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ita-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ita}"
RDEPENDS:tesseract-langpack-ita = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ita_old = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ita_old-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ita_old}"
RDEPENDS:tesseract-langpack-ita_old = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-jav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-jav-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-jav}"
RDEPENDS:tesseract-langpack-jav = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-jpn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-jpn-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-jpn}"
RDEPENDS:tesseract-langpack-jpn = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-jpn_vert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-jpn_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-jpn_vert}"
RDEPENDS:tesseract-langpack-jpn_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kan-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kan}"
RDEPENDS:tesseract-langpack-kan = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kat-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kat}"
RDEPENDS:tesseract-langpack-kat = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kat_old = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kat_old-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kat_old}"
RDEPENDS:tesseract-langpack-kat_old = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kaz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kaz-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kaz}"
RDEPENDS:tesseract-langpack-kaz = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-khm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-khm-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-khm}"
RDEPENDS:tesseract-langpack-khm = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kir-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kir}"
RDEPENDS:tesseract-langpack-kir = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kmr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kmr-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kmr}"
RDEPENDS:tesseract-langpack-kmr = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kor-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kor}"
RDEPENDS:tesseract-langpack-kor = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-kor_vert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-kor_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-kor_vert}"
RDEPENDS:tesseract-langpack-kor_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-lao = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-lao-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-lao}"
RDEPENDS:tesseract-langpack-lao = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-lat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-lat-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-lat}"
RDEPENDS:tesseract-langpack-lat = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-lav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-lav-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-lav}"
RDEPENDS:tesseract-langpack-lav = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-lit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-lit-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-lit}"
RDEPENDS:tesseract-langpack-lit = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ltz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ltz-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ltz}"
RDEPENDS:tesseract-langpack-ltz = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mal-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mal}"
RDEPENDS:tesseract-langpack-mal = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mar-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mar}"
RDEPENDS:tesseract-langpack-mar = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mkd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mkd-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mkd}"
RDEPENDS:tesseract-langpack-mkd = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mlt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mlt-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mlt}"
RDEPENDS:tesseract-langpack-mlt = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mon-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mon}"
RDEPENDS:tesseract-langpack-mon = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mri = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mri-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mri}"
RDEPENDS:tesseract-langpack-mri = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-msa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-msa-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-msa}"
RDEPENDS:tesseract-langpack-msa = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-mya = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-mya-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-mya}"
RDEPENDS:tesseract-langpack-mya = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-nep = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-nep-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-nep}"
RDEPENDS:tesseract-langpack-nep = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-nld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-nld-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-nld}"
RDEPENDS:tesseract-langpack-nld = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-nor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-nor-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-nor}"
RDEPENDS:tesseract-langpack-nor = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-oci = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-oci-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-oci}"
RDEPENDS:tesseract-langpack-oci = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ori = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ori-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ori}"
RDEPENDS:tesseract-langpack-ori = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-pan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-pan-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-pan}"
RDEPENDS:tesseract-langpack-pan = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-pol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-pol-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-pol}"
RDEPENDS:tesseract-langpack-pol = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-por = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-por-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-por}"
RDEPENDS:tesseract-langpack-por = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-pus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-pus-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-pus}"
RDEPENDS:tesseract-langpack-pus = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-que = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-que-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-que}"
RDEPENDS:tesseract-langpack-que = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ron = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ron-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ron}"
RDEPENDS:tesseract-langpack-ron = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-rus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-rus-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-rus}"
RDEPENDS:tesseract-langpack-rus = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-san = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-san-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-san}"
RDEPENDS:tesseract-langpack-san = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-sin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-sin-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-sin}"
RDEPENDS:tesseract-langpack-sin = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-slk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-slk-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-slk}"
RDEPENDS:tesseract-langpack-slk = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-slv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-slv-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-slv}"
RDEPENDS:tesseract-langpack-slv = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-snd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-snd-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-snd}"
RDEPENDS:tesseract-langpack-snd = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-spa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-spa-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-spa}"
RDEPENDS:tesseract-langpack-spa = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-spa_old = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-spa_old-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-spa_old}"
RDEPENDS:tesseract-langpack-spa_old = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-sqi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-sqi-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-sqi}"
RDEPENDS:tesseract-langpack-sqi = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-srp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-srp-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-srp}"
RDEPENDS:tesseract-langpack-srp = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-srp_latn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-srp_latn-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-srp_latn}"
RDEPENDS:tesseract-langpack-srp_latn = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-sun = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-sun-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-sun}"
RDEPENDS:tesseract-langpack-sun = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-swa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-swa-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-swa}"
RDEPENDS:tesseract-langpack-swa = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-swe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-swe-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-swe}"
RDEPENDS:tesseract-langpack-swe = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-syr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-syr-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-syr}"
RDEPENDS:tesseract-langpack-syr = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tam-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tam}"
RDEPENDS:tesseract-langpack-tam = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tat-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tat}"
RDEPENDS:tesseract-langpack-tat = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tel-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tel}"
RDEPENDS:tesseract-langpack-tel = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tgk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tgk-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tgk}"
RDEPENDS:tesseract-langpack-tgk = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tha = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tha-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tha}"
RDEPENDS:tesseract-langpack-tha = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tir-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tir}"
RDEPENDS:tesseract-langpack-tir = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ton = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ton-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ton}"
RDEPENDS:tesseract-langpack-ton = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-tur = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-tur-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-tur}"
RDEPENDS:tesseract-langpack-tur = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-uig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-uig-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-uig}"
RDEPENDS:tesseract-langpack-uig = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-ukr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-ukr-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-ukr}"
RDEPENDS:tesseract-langpack-ukr = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-urd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-urd-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-urd}"
RDEPENDS:tesseract-langpack-urd = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-uzb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-uzb-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-uzb}"
RDEPENDS:tesseract-langpack-uzb = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-uzb_cyrl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-uzb_cyrl-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-uzb_cyrl}"
RDEPENDS:tesseract-langpack-uzb_cyrl = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-vie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-vie-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-vie}"
RDEPENDS:tesseract-langpack-vie = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-yid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-yid-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-yid}"
RDEPENDS:tesseract-langpack-yid = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-langpack-yor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-langpack-yor-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-langpack-yor}"
RDEPENDS:tesseract-langpack-yor = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-tessdata-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-tessdata-doc-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-tessdata-doc}"
RDEPENDS:tesseract-tessdata-doc = ""

URI_tesseract-equ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-equ-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-equ}"
RDEPENDS:tesseract-equ = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-osd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-osd-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-osd}"
RDEPENDS:tesseract-osd = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-arabic = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-arabic-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-arabic}"
RDEPENDS:tesseract-script-arabic = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-armenian = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-armenian-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-armenian}"
RDEPENDS:tesseract-script-armenian = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-bengali = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-bengali-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-bengali}"
RDEPENDS:tesseract-script-bengali = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-canadian_aboriginal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-canadian_aboriginal-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-canadian_aboriginal}"
RDEPENDS:tesseract-script-canadian_aboriginal = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-cherokee = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-cherokee-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-cherokee}"
RDEPENDS:tesseract-script-cherokee = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-cyrillic = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-cyrillic-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-cyrillic}"
RDEPENDS:tesseract-script-cyrillic = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-devanagari = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-devanagari-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-devanagari}"
RDEPENDS:tesseract-script-devanagari = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-ethiopic = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-ethiopic-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-ethiopic}"
RDEPENDS:tesseract-script-ethiopic = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-fraktur = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-fraktur-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-fraktur}"
RDEPENDS:tesseract-script-fraktur = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-georgian = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-georgian-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-georgian}"
RDEPENDS:tesseract-script-georgian = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-greek = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-greek-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-greek}"
RDEPENDS:tesseract-script-greek = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-gujarati = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-gujarati-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-gujarati}"
RDEPENDS:tesseract-script-gujarati = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-gurmukhi = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-gurmukhi-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-gurmukhi}"
RDEPENDS:tesseract-script-gurmukhi = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hangul = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hangul-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hangul}"
RDEPENDS:tesseract-script-hangul = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hangul_vert = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hangul_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hangul_vert}"
RDEPENDS:tesseract-script-hangul_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hans = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hans-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hans}"
RDEPENDS:tesseract-script-hans = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hans_vert = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hans_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hans_vert}"
RDEPENDS:tesseract-script-hans_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hant = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hant-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hant}"
RDEPENDS:tesseract-script-hant = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hant_vert = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hant_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hant_vert}"
RDEPENDS:tesseract-script-hant_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-hebrew = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-hebrew-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-hebrew}"
RDEPENDS:tesseract-script-hebrew = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-japanese = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-japanese-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-japanese}"
RDEPENDS:tesseract-script-japanese = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-japanese_vert = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-japanese_vert-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-japanese_vert}"
RDEPENDS:tesseract-script-japanese_vert = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-kannada = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-kannada-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-kannada}"
RDEPENDS:tesseract-script-kannada = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-khmer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-khmer-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-khmer}"
RDEPENDS:tesseract-script-khmer = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-lao = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-lao-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-lao}"
RDEPENDS:tesseract-script-lao = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-latin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-latin-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-latin}"
RDEPENDS:tesseract-script-latin = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-malayalam = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-malayalam-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-malayalam}"
RDEPENDS:tesseract-script-malayalam = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-myanmar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-myanmar-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-myanmar}"
RDEPENDS:tesseract-script-myanmar = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-oriya = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-oriya-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-oriya}"
RDEPENDS:tesseract-script-oriya = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-sinhala = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-sinhala-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-sinhala}"
RDEPENDS:tesseract-script-sinhala = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-syriac = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-syriac-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-syriac}"
RDEPENDS:tesseract-script-syriac = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-tamil = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-tamil-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-tamil}"
RDEPENDS:tesseract-script-tamil = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-telugu = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-telugu-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-telugu}"
RDEPENDS:tesseract-script-telugu = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-thaana = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-thaana-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-thaana}"
RDEPENDS:tesseract-script-thaana = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-thai = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-thai-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-thai}"
RDEPENDS:tesseract-script-thai = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-tibetan = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-tibetan-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-tibetan}"
RDEPENDS:tesseract-script-tibetan = " \
 tesseract \
 tesseract-tessdata-doc \
"

URI_tesseract-script-vietnamese = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-script-vietnamese-4.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tesseract-script-vietnamese}"
RDEPENDS:tesseract-script-vietnamese = " \
 tesseract \
 tesseract-tessdata-doc \
"
