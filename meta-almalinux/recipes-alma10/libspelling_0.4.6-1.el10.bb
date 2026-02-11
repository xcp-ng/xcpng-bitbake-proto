
PN = "libspelling"
PE = "0"
PV = "0.4.6"
PR = "1.el10"
PACKAGES = "libspelling libspelling-devel"


URI_libspelling = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libspelling-0.4.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspelling = " \
 enchant2 \
 libgcc \
 pango \
 glib2 \
 glibc \
 libicu \
 gtk4 \
 gtksourceview5 \
"

URI_libspelling-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libspelling-devel-0.4.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspelling-devel = " \
 glib2-devel \
 libspelling \
 pkgconf-pkg-config \
 gtksourceview5-devel \
 gtk4-devel \
"
