
inherit dnf-bridge

PN = "seahorse"
PE = "0"
PV = "43.0"
PR = "10.el10"
PACKAGES = "seahorse"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/seahorse-43.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_seahorse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/seahorse-43.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_seahorse}"
RDEPENDS:seahorse = " \
 gcr3 \
 libhandy \
 gcr3-base \
 libsoup3 \
 libpwquality \
 libgcc \
 gpgme \
 gdk-pixbuf2 \
 pinentry-gnome3 \
 libsecret \
 glib2 \
 gtk3 \
 glibc \
 openldap \
"
