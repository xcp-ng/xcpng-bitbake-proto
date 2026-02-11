
PN = "libverto"
PE = "0"
PV = "0.3.2"
PR = "10.el10"
PACKAGES = "libverto libverto-libev libverto-devel libverto-glib libverto-glib-devel libverto-libev-devel libverto-libevent libverto-libevent-devel"


URI_libverto = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libverto-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto = " \
 glibc \
"

URI_libverto-libev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libverto-libev-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libev = " \
 glibc \
 libverto \
 libev \
"

URI_libverto-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libverto-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-devel = " \
 libverto \
 pkgconf-pkg-config \
"

URI_libverto-glib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-glib-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-glib = " \
 glibc \
 libverto \
 glib2 \
"

URI_libverto-glib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-glib-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-glib-devel = " \
 libverto-devel \
 pkgconf-pkg-config \
 libverto-glib \
"

URI_libverto-libev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libev-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libev-devel = " \
 libverto-devel \
 libverto-libev \
 pkgconf-pkg-config \
"

URI_libverto-libevent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libevent-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libevent = " \
 glibc \
 libverto \
 libevent \
"

URI_libverto-libevent-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libevent-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libevent-devel = " \
 libverto-libevent \
 libverto-devel \
 pkgconf-pkg-config \
"
