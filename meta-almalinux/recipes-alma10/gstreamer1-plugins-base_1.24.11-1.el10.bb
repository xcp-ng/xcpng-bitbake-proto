
PN = "gstreamer1-plugins-base"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1-plugins-base gstreamer1-plugins-base-devel gstreamer1-plugins-base-tools"


URI_gstreamer1-plugins-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-base-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-base = " \
 libpng \
 pango \
 libX11 \
 libX11-xcb \
 libtheora \
 libdrm \
 libXext \
 libogg \
 libXi \
 cairo \
 libXv \
 alsa-lib \
 libvorbis \
 zlib-ng-compat \
 libwayland-client \
 libglvnd-egl \
 libwayland-cursor \
 libwayland-egl \
 libglvnd-glx \
 libgudev \
 libxcb \
 mesa-libgbm \
 graphene \
 opus \
 orc \
 gstreamer1 \
 glib2 \
 glibc \
 libjpeg-turbo \
 iso-codes \
"

URI_gstreamer1-plugins-base-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-base-devel-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-base-devel = " \
 orc-devel \
 wayland-devel \
 glib2-devel \
 libglvnd-devel \
 gstreamer1-devel \
 zlib-ng-compat-devel \
 gstreamer1-plugins-base \
 pkgconf-pkg-config \
 gstreamer1-plugins-base-devel \
 libX11-devel \
 libgudev-devel \
 mesa-libgbm-devel \
 libdrm-devel \
"

URI_gstreamer1-plugins-base-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-base-tools-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-base-tools = " \
 glibc \
 gstreamer1-plugins-base \
 glib2 \
 gstreamer1 \
"
