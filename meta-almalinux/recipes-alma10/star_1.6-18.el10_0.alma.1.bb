
inherit dnf-bridge

PN = "star"
PE = "0"
PV = "1.6"
PR = "18.el10_0.alma.1"
PACKAGES = "rmt scpio spax star"


URI_rmt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rmt-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rmt = " \
 glibc \
"

URI_scpio = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/scpio-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:scpio = " \
 glibc \
 libacl \
"

URI_spax = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/spax-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:spax = " \
 glibc \
 alternatives \
 libacl \
 bash \
"

URI_star = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/star-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:star = " \
 glibc \
 libacl \
"
