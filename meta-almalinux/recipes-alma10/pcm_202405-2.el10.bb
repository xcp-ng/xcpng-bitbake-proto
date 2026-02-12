
inherit dnf-bridge

PN = "pcm"
PE = "0"
PV = "202405"
PR = "2.el10"
PACKAGES = "pcm"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pcm-202405-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pcm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcm-202405-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcm}"
RDEPENDS:pcm = " \
 glibc \
 libgcc \
 bash \
 libstdc++ \
"
