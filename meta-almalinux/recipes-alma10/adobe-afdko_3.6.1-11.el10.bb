
inherit dnf-bridge

PN = "adobe-afdko"
PE = "0"
PV = "3.6.1"
PR = "11.el10"
PACKAGES = "adobe-afdko"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/adobe-afdko-3.6.1-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_adobe-afdko = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adobe-afdko-3.6.1-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_adobe-afdko}"
RDEPENDS:adobe-afdko = " \
 glibc \
"
