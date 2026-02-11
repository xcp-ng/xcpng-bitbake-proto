
inherit dnf-bridge

PN = "gnome-online-accounts"
PE = "0"
PV = "3.52.3.1"
PR = "1.el10"
PACKAGES = "gnome-online-accounts gnome-online-accounts-devel"


URI_gnome-online-accounts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-online-accounts-3.52.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-online-accounts = " \
 libsoup3 \
 gvfs-goa \
 keyutils-libs \
 libgcc \
 rest \
 libxml2 \
 json-glib \
 krb5-libs \
 libsecret \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
 gcr-libs \
"

URI_gnome-online-accounts-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-online-accounts-devel-3.52.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-online-accounts-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 gnome-online-accounts-devel \
 libadwaita-devel \
 gnome-online-accounts \
 gtk4-devel \
"
