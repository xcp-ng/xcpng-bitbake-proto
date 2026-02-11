
PN = "libopenraw"
PE = "0"
PV = "0.1.3"
PR = "19.el10"
PACKAGES = "libopenraw libopenraw-devel libopenraw-gnome libopenraw-gnome-devel libopenraw-pixbuf-loader"


URI_libopenraw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libopenraw-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw = " \
 glibc \
 libgcc \
 libjpeg-turbo \
 libstdc++ \
"

URI_libopenraw-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-devel-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-devel = " \
 pkgconf-pkg-config \
 libopenraw \
"

URI_libopenraw-gnome = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-gnome-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-gnome = " \
 glibc \
 glib2 \
 libopenraw \
 gdk-pixbuf2 \
"

URI_libopenraw-gnome-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libopenraw-gnome-devel-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-gnome-devel = " \
 libopenraw-devel \
 pkgconf-pkg-config \
 libopenraw-gnome \
"

URI_libopenraw-pixbuf-loader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libopenraw-pixbuf-loader-0.1.3-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libopenraw-pixbuf-loader = " \
 glibc \
 glib2 \
 libopenraw \
 gdk-pixbuf2 \
"
