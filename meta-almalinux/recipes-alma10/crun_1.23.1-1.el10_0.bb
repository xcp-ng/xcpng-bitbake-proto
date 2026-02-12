
inherit dnf-bridge

PN = "crun"
PE = "0"
PV = "1.23.1"
PR = "1.el10_0"
PACKAGES = "crun"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/crun-1.23.1-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_crun = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crun-1.23.1-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_crun}"
RDEPENDS:crun = " \
 systemd-libs \
 libgcc \
 libcap \
 libseccomp \
 glibc \
"
