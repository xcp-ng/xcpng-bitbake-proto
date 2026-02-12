
inherit dnf-bridge

PN = "firefox"
PE = "0"
PV = "140.4.0"
PR = "3.el10_0"
PACKAGES = "firefox firefox-x11"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/firefox-140.4.0-3.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_firefox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/firefox-140.4.0-3.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_firefox}"
RDEPENDS:firefox = " \
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
 almalinux-indexhtml \
 cairo-gobject \
 alsa-lib \
 atk \
 zlib-ng-compat \
 libffi \
 libgcc \
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
 mozilla-filesystem \
 libjpeg-turbo \
 nspr \
"

URI_firefox-x11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/firefox-x11-140.4.0-3.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_firefox-x11}"
RDEPENDS:firefox-x11 = " \
 bash \
 firefox \
"
