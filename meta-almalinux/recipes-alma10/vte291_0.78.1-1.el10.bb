
inherit dnf-bridge

PN = "vte291"
PE = "0"
PV = "0.78.1"
PR = "1.el10"
PACKAGES = "vte-profile vte291 vte291-gtk4 vte291-devel vte291-gtk4-devel"


URI_vte-profile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vte-profile-0.78.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vte-profile = " \
 glibc \
"

URI_vte291 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vte291-0.78.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vte291 = " \
 atk \
 systemd-libs \
 gnutls \
 cairo-gobject \
 lz4-libs \
 libgcc \
 fribidi \
 pango \
 libstdc++ \
 pcre2 \
 glib2 \
 cairo \
 gtk3 \
 glibc \
 libicu \
 vte-profile \
"

URI_vte291-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vte291-gtk4-0.78.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vte291-gtk4 = " \
 systemd-libs \
 gnutls \
 lz4-libs \
 vte291 \
 libgcc \
 fribidi \
 pango \
 libstdc++ \
 pcre2 \
 glib2 \
 cairo \
 cairo-gobject \
 glibc \
 libicu \
 gtk4 \
 graphene \
"

URI_vte291-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vte291-devel-0.78.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vte291-devel = " \
 glib2-devel \
 cairo-gobject \
 vte291 \
 libgcc \
 gtk3-devel \
 pkgconf-pkg-config \
 pango \
 gdk-pixbuf2 \
 pango-devel \
 libstdc++ \
 glib2 \
 cairo \
 gtk3 \
 glibc \
 cairo-devel \
"

URI_vte291-gtk4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vte291-gtk4-devel-0.78.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vte291-gtk4-devel = " \
 glib2-devel \
 libgcc \
 pkgconf-pkg-config \
 pango \
 gdk-pixbuf2 \
 vte291-gtk4 \
 pango-devel \
 libstdc++ \
 glib2 \
 cairo \
 cairo-gobject \
 glibc \
 vte291-devel \
 gtk4 \
 cairo-devel \
 gtk4-devel \
"
