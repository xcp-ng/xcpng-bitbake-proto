
inherit dnf-bridge

PN = "libcanberra"
PE = "0"
PV = "0.30"
PR = "37.el10"
PACKAGES = "libcanberra libcanberra-devel libcanberra-gtk3"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libcanberra-0.30-37.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libcanberra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-0.30-37.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcanberra}"
RDEPENDS:libcanberra = " \
 alsa-lib \
 libvorbis \
 sound-theme-freedesktop \
 libtool-ltdl \
 systemd-libs \
 gstreamer1 \
 pulseaudio-libs \
 bash \
 glib2 \
 libtdb \
 glibc \
"

URI_libcanberra-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-devel-0.30-37.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcanberra-devel}"
RDEPENDS:libcanberra-devel = " \
 pkgconf-pkg-config \
 libcanberra \
 libcanberra-devel \
 libcanberra-gtk3 \
 gtk3-devel \
"

URI_libcanberra-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-gtk3-0.30-37.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcanberra-gtk3}"
RDEPENDS:libcanberra-gtk3 = " \
 libvorbis \
 atk \
 libtool-ltdl \
 cairo-gobject \
 libtdb \
 harfbuzz \
 pango \
 gdk-pixbuf2 \
 libX11 \
 libcanberra \
 bash \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"
