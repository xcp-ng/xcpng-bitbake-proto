
inherit dnf-bridge

PN = "ftp"
PE = "0"
PV = "0.17"
PR = "97.el10"
PACKAGES = "ftp"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ftp-0.17-97.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ftp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ftp-0.17-97.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ftp}"
RDEPENDS:ftp = " \
 glibc \
 readline \
"
