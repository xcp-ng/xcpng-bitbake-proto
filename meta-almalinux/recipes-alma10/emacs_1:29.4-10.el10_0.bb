
inherit dnf-bridge

PN = "emacs"
PE = "1"
PV = "29.4"
PR = "10.el10_0"
PACKAGES = "emacs emacs-common emacs-filesystem emacs-lucid emacs-nw emacs-devel emacs-gtk+x11 emacs-terminal"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/emacs-29.4-10.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_emacs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs}"
RDEPENDS:emacs = " \
 systemd-libs \
 libpng \
 libtree-sitter \
 pango \
 fontconfig \
 ncurses-libs \
 dbus-libs \
 libselinux \
 libacl \
 emacs-common \
 jansson \
 libotf \
 cairo \
 alternatives \
 alsa-lib \
 zlib-ng-compat \
 gnutls \
 google-noto-sans-mono-vf-fonts \
 librsvg2 \
 libgcc \
 libwebp \
 libxml2 \
 gdk-pixbuf2 \
 sqlite-libs \
 bash \
 giflib \
 freetype \
 harfbuzz \
 glib2 \
 gtk3 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_emacs-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-common-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs-common}"
RDEPENDS:emacs-common = " \
 emacs-filesystem \
 libtree-sitter \
 pkgconf-pkg-config \
 bash \
 glibc \
 alternatives \
 libgccjit \
"

URI_emacs-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-filesystem-29.4-10.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_emacs-filesystem}"
RDEPENDS:emacs-filesystem = ""

URI_emacs-lucid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-lucid-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs-lucid}"
RDEPENDS:emacs-lucid = " \
 systemd-libs \
 libpng \
 libtree-sitter \
 libICE \
 fontconfig \
 libSM \
 libX11 \
 ncurses-libs \
 dbus-libs \
 libselinux \
 libXcomposite \
 libXext \
 m17n-lib \
 libXfixes \
 libacl \
 Xaw3d \
 emacs-common \
 libXi \
 jansson \
 libXinerama \
 libXmu \
 libotf \
 libXpm \
 libXrandr \
 libXrender \
 libXt \
 cairo \
 alternatives \
 alsa-lib \
 zlib-ng-compat \
 gnutls \
 google-noto-sans-mono-vf-fonts \
 librsvg2 \
 libgcc \
 libwebp \
 libxml2 \
 gdk-pixbuf2 \
 sqlite-libs \
 bash \
 giflib \
 freetype \
 harfbuzz \
 glib2 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_emacs-nw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-nw-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs-nw}"
RDEPENDS:emacs-nw = " \
 alsa-lib \
 libacl \
 zlib-ng-compat \
 emacs-common \
 systemd-libs \
 gnutls \
 jansson \
 libgcc \
 libtree-sitter \
 libxml2 \
 sqlite-libs \
 bash \
 ncurses-libs \
 glibc \
 libselinux \
 dbus-libs \
 alternatives \
"

URI_emacs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-devel-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs-devel}"
RDEPENDS:emacs-devel = ""

URI_emacs-gtk+x11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-gtk+x11-29.4-10.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_emacs-gtk+x11}"
RDEPENDS:emacs-gtk+x11 = " \
 systemd-libs \
 libpng \
 libtree-sitter \
 libICE \
 pango \
 fontconfig \
 libX11 \
 libSM \
 ncurses-libs \
 dbus-libs \
 libselinux \
 libXcomposite \
 libXext \
 m17n-lib \
 libXfixes \
 libacl \
 emacs-common \
 libXi \
 jansson \
 libXinerama \
 libotf \
 libXrandr \
 libXrender \
 cairo \
 alternatives \
 libgccjit \
 alsa-lib \
 zlib-ng-compat \
 gnutls \
 librsvg2 \
 libgcc \
 libwebp \
 libxml2 \
 gdk-pixbuf2 \
 sqlite-libs \
 bash \
 giflib \
 freetype \
 harfbuzz \
 glib2 \
 gtk3 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_emacs-terminal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-terminal-29.4-10.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_emacs-terminal}"
RDEPENDS:emacs-terminal = " \
 emacs \
 bash \
"
