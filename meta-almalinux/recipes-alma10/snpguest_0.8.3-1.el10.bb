
inherit dnf-bridge

PN = "snpguest"
PE = "0"
PV = "0.8.3"
PR = "1.el10"
PACKAGES = "snpguest"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/snpguest-0.8.3-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_snpguest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snpguest-0.8.3-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_snpguest}"
RDEPENDS:snpguest = " \
 glibc \
 openssl-libs \
 libgcc \
"
