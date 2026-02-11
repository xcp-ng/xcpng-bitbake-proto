
inherit dnf-bridge

PN = "pcm"
PE = "0"
PV = "202405"
PR = "2.el10"
PACKAGES = "pcm"


URI_pcm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcm-202405-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcm = " \
 glibc \
 libgcc \
 bash \
 libstdc++ \
"
