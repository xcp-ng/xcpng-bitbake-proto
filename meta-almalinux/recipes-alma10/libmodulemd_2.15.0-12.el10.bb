
PN = "libmodulemd"
PE = "0"
PV = "2.15.0"
PR = "12.el10"
PACKAGES = "libmodulemd python3-libmodulemd libmodulemd-devel"


URI_libmodulemd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmodulemd-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmodulemd = " \
 libgcc \
 libyaml \
 glib2 \
 glibc \
 rpm-libs \
"

URI_python3-libmodulemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libmodulemd-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libmodulemd = " \
 python3 \
 python3-six \
 libmodulemd \
 python3-gobject-base \
"

URI_libmodulemd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmodulemd-devel-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmodulemd-devel = " \
 glib2-devel \
 libmodulemd \
 pkgconf-pkg-config \
 libyaml-devel \
 rpm-devel \
"
