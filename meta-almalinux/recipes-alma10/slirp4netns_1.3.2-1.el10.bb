
inherit dnf-bridge

PN = "slirp4netns"
PE = "0"
PV = "1.3.2"
PR = "1.el10"
PACKAGES = "slirp4netns"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/slirp4netns-1.3.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_slirp4netns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slirp4netns-1.3.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_slirp4netns}"
RDEPENDS:slirp4netns = " \
 glibc \
 libslirp \
 glib2 \
 libseccomp \
"
