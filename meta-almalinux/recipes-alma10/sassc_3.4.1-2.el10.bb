
inherit dnf-bridge

PN = "sassc"
PE = "0"
PV = "3.4.1"
PR = "2.el10"
PACKAGES = "sassc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/sassc-3.4.1-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sassc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sassc-3.4.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sassc}"
RDEPENDS:sassc = " \
 glibc \
 libstdc++ \
 libsass \
"
