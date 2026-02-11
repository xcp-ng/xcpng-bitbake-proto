
PN = "gtk-vnc"
PE = "0"
PV = "1.3.1"
PR = "7.el10"
PACKAGES = "gtk-vnc2 gvnc gvncpulse gtk-vnc2-devel gvnc-devel gvnc-tools gvncpulse-devel"


URI_gtk-vnc2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk-vnc2-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-vnc2 = "
 gdk-pixbuf2
 libX11
 gvnc
 cairo
 glib2
 gtk3
 glibc
"

URI_gvnc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvnc-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc = "
 zlib-ng-compat
 gnutls
 libgcrypt
 gdk-pixbuf2
 cyrus-sasl-lib
 glib2
 glibc
"

URI_gvncpulse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvncpulse-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvncpulse = "
 glibc
 pulseaudio-libs
 glib2
 gvnc
"

URI_gtk-vnc2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk-vnc2-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-vnc2-devel = "
 libgcrypt-devel
 glib2-devel
 gnutls-devel
 zlib-ng-compat-devel
 cyrus-sasl-devel
 pkgconf-pkg-config
 gdk-pixbuf2-devel
 libX11-devel
 gtk-vnc2
 gtk3-devel
 gvnc-devel
"

URI_gvnc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gvnc-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc-devel = "
 libgcrypt-devel
 glib2-devel
 gnutls-devel
 zlib-ng-compat-devel
 cyrus-sasl-devel
 pkgconf-pkg-config
 gvnc
 gdk-pixbuf2-devel
"

URI_gvnc-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gvnc-tools-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc-tools = "
 glibc
 gvnc
 glib2
 gdk-pixbuf2
"

URI_gvncpulse-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gvncpulse-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvncpulse-devel = "
 libgcrypt-devel
 glib2-devel
 gnutls-devel
 zlib-ng-compat-devel
 cyrus-sasl-devel
 pulseaudio-libs-devel
 pkgconf-pkg-config
 gvncpulse
 gdk-pixbuf2-devel
 gvnc-devel
"
