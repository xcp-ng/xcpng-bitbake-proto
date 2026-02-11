
PN = "phodav"
PE = "0"
PV = "3.0"
PR = "6.el10"
PACKAGES = "libphodav libphodav-devel spice-webdavd chezdav"


URI_libphodav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libphodav-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libphodav = " \
 glibc \
 libxml2 \
 libsoup3 \
 glib2 \
"

URI_libphodav-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libphodav-devel-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libphodav-devel = " \
 libxml2-devel \
 glib2-devel \
 libsoup3-devel \
 pkgconf-pkg-config \
 libphodav \
"

URI_spice-webdavd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-webdavd-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-webdavd = " \
 systemd \
 avahi-gobject \
 avahi \
 bash \
 glib2 \
 glibc \
"

URI_chezdav = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/chezdav-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chezdav = " \
 libsoup3 \
 avahi-gobject \
 libphodav \
 glib2 \
 glibc \
"
