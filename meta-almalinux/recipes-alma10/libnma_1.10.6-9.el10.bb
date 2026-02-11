
PN = "libnma"
PE = "0"
PV = "1.10.6"
PR = "9.el10"
PACKAGES = "libnma libnma-gtk4 libnma-devel libnma-gtk4-devel"


URI_libnma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnma-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma = " \
 mobile-broadband-provider-info \
 libgcc \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 NetworkManager-libnm \
 gcr-libs \
"

URI_libnma-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnma-gtk4-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-gtk4 = " \
 mobile-broadband-provider-info \
 libgcc \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 NetworkManager-libnm \
 gcr-libs \
"

URI_libnma-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnma-devel-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-devel = " \
 NetworkManager-libnm-devel \
 pkgconf-pkg-config \
 libnma \
 gtk3-devel \
"

URI_libnma-gtk4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnma-gtk4-devel-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-gtk4-devel = " \
 gtk4-devel \
 NetworkManager-libnm-devel \
 pkgconf-pkg-config \
 libnma-gtk4 \
"
