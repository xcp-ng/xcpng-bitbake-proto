
inherit dnf-bridge

PN = "thunderbird"
PE = "0"
PV = "140.4.0"
PR = "2.el10_0.alma.1"
PACKAGES = "thunderbird"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/thunderbird-140.4.0-2.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_thunderbird = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/thunderbird-140.4.0-2.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_thunderbird}"
RDEPENDS:thunderbird = " \
 nss \
 pango \
 fontconfig \
 libX11 \
 libX11-xcb \
 nss-util \
 dbus-libs \
 libXcomposite \
 libXcursor \
 libXdamage \
 libXext \
 libXfixes \
 libXi \
 libXrandr \
 libXrender \
 libstdc++ \
 cairo \
 cairo-gobject \
 alsa-lib \
 atk \
 zlib-ng-compat \
 libffi \
 libgcc \
 openssl-libs \
 p11-kit-trust \
 gdk-pixbuf2 \
 libxcb \
 pciutils-libs \
 bash \
 freetype \
 harfbuzz \
 glib2 \
 gtk3 \
 glibc \
 libjpeg-turbo \
 nspr \
"
