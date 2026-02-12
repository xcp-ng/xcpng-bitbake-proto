
inherit dnf-bridge

PN = "wireplumber"
PE = "0"
PV = "0.5.5"
PR = "2.el10"
PACKAGES = "wireplumber wireplumber-libs wireplumber-devel wireplumber-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/wireplumber-0.5.5-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_wireplumber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireplumber-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wireplumber}"
RDEPENDS:wireplumber = " \
 libgcc \
 wireplumber-libs \
 bash \
 glib2 \
 glibc \
 pipewire-libs \
"

URI_wireplumber-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireplumber-libs-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wireplumber-libs}"
RDEPENDS:wireplumber-libs = " \
 systemd-libs \
 lua-libs \
 libgcc \
 glib2 \
 glibc \
 pipewire-libs \
"

URI_wireplumber-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wireplumber-devel-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wireplumber-devel}"
RDEPENDS:wireplumber-devel = " \
 glib2-devel \
 wireplumber \
 wireplumber-libs \
 pkgconf-pkg-config \
 pipewire-devel \
"

URI_wireplumber-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wireplumber-doc-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wireplumber-doc}"
RDEPENDS:wireplumber-doc = ""
