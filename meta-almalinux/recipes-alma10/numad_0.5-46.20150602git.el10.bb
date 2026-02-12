
inherit dnf-bridge

PN = "numad"
PE = "0"
PV = "0.5"
PR = "46.20150602git.el10"
PACKAGES = "numad"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/numad-0.5-46.20150602git.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_numad = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numad-0.5-46.20150602git.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_numad}"
RDEPENDS:numad = " \
 glibc \
 bash \
"
