
inherit dnf-bridge

PN = "appstream"
PE = "0"
PV = "1.0.2"
PR = "5.el10"
PACKAGES = "appstream appstream-compose appstream-compose-devel appstream-devel appstream-qt appstream-qt-devel"


URI_appstream = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/appstream-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream = " \
 systemd-libs \
 libgcc \
 appstream-data \
 libxml2 \
 libxmlb \
 libyaml \
 libzstd \
 bash \
 glib2 \
 libcurl \
 glibc \
"

URI_appstream-compose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/appstream-compose-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-compose = " \
 freetype \
 librsvg2 \
 appstream \
 libgcc \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 libyaml \
 cairo \
 glib2 \
 glibc \
"

URI_appstream-compose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-compose-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-compose-devel = " \
 glib2-devel \
 appstream-compose \
 pkgconf-pkg-config \
 gdk-pixbuf2-devel \
 appstream-devel \
"

URI_appstream-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-devel = " \
 appstream \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_appstream-qt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-qt-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-qt = " \
 appstream \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 glib2 \
 glibc \
"

URI_appstream-qt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-qt-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-qt-devel = " \
 qt6-qtbase-devel \
 cmake-filesystem \
 appstream-qt \
"
