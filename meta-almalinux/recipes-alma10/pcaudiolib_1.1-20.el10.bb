
inherit dnf-bridge

PN = "pcaudiolib"
PE = "0"
PV = "1.1"
PR = "20.el10"
PACKAGES = "pcaudiolib pcaudiolib-devel"


URI_pcaudiolib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcaudiolib-1.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcaudiolib = " \
 glibc \
 pulseaudio-libs \
 alsa-lib \
"

URI_pcaudiolib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pcaudiolib-devel-1.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcaudiolib-devel = " \
 pcaudiolib \
"
