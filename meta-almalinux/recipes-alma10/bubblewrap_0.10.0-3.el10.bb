
inherit dnf-bridge

PN = "bubblewrap"
PE = "0"
PV = "0.10.0"
PR = "3.el10"
PACKAGES = "bubblewrap"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/bubblewrap-0.10.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bubblewrap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bubblewrap-0.10.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bubblewrap}"
RDEPENDS:bubblewrap = " \
 glibc \
 libselinux \
 libgcc \
 libcap \
"
