
inherit dnf-bridge

PN = "snphost"
PE = "0"
PV = "0.5.0"
PR = "1.el10"
PACKAGES = "snphost"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/snphost-0.5.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_snphost = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snphost-0.5.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_snphost}"
RDEPENDS:snphost = " \
 glibc \
 openssl-libs \
 libgcc \
"
