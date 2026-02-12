
inherit dnf-bridge

PN = "ibus"
PE = "0"
PV = "1.5.31"
PR = "3.el10"
PACKAGES = "ibus ibus-gtk3 ibus-gtk4 ibus-libs ibus-setup ibus-wayland ibus-devel ibus-devel-docs ibus-panel ibus-desktop-testing ibus-tests ibus-xinit"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ibus-1.5.31-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ibus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus}"
RDEPENDS:ibus = " \
 python3 \
 libXfixes \
 python3-gobject \
 desktop-file-utils \
 ibus-setup \
 libXi \
 pango \
 gdk-pixbuf2 \
 libX11 \
 ibus-gtk3 \
 bash \
 glib2 \
 gtk3 \
 ibus-libs \
 glibc \
 alternatives \
 dconf \
 iso-codes \
"

URI_ibus-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-gtk3-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-gtk3}"
RDEPENDS:ibus-gtk3 = " \
 atk \
 cairo-gobject \
 harfbuzz \
 pango \
 gdk-pixbuf2 \
 ibus-libs \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 dbus-libs \
"

URI_ibus-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-gtk4-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-gtk4}"
RDEPENDS:ibus-gtk4 = " \
 vulkan-loader \
 harfbuzz \
 pango \
 gdk-pixbuf2 \
 ibus-libs \
 cairo \
 glib2 \
 cairo-gobject \
 glibc \
 graphene \
 gtk4 \
 dbus-libs \
"

URI_ibus-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-libs-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-libs}"
RDEPENDS:ibus-libs = " \
 glibc \
 glib2 \
 gobject-introspection \
 dbus \
"

URI_ibus-setup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-setup-1.5.31-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ibus-setup}"
RDEPENDS:ibus-setup = " \
 python3 \
 ibus \
 python3-gobject \
 bash \
"

URI_ibus-wayland = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-wayland-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-wayland}"
RDEPENDS:ibus-wayland = " \
 libwayland-client \
 glib2 \
 ibus-libs \
 glibc \
 libxkbcommon \
"

URI_ibus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-devel-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-devel}"
RDEPENDS:ibus-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 gettext-runtime \
 dbus-devel \
 ibus-libs \
"

URI_ibus-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-devel-docs-1.5.31-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ibus-devel-docs}"
RDEPENDS:ibus-devel-docs = ""

URI_ibus-panel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-panel-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-panel}"
RDEPENDS:ibus-panel = " \
 atk \
 libXi \
 libwayland-client \
 libdbusmenu \
 pango \
 gdk-pixbuf2 \
 libX11 \
 libdbusmenu-gtk3 \
 ibus \
 ibus-libs \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 libxkbcommon \
 libnotify \
"

URI_ibus-desktop-testing = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-desktop-testing-1.5.31-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ibus-desktop-testing}"
RDEPENDS:ibus-desktop-testing = " \
 ibus \
 bash \
 gnome-shell-extension-no-overview \
"

URI_ibus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-tests-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-tests}"
RDEPENDS:ibus-tests = " \
 libX11 \
 ibus \
 bash \
 glib2 \
 libXtst \
 ibus-libs \
 glibc \
 gtk4 \
 dbus-libs \
"

URI_ibus-xinit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-xinit-1.5.31-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ibus-xinit}"
RDEPENDS:ibus-xinit = " \
 ibus \
 bash \
"
