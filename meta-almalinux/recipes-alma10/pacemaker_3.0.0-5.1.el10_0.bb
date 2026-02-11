
PN = "pacemaker"
PE = "0"
PV = "3.0.0"
PR = "5.1.el10_0"
PACKAGES = "pacemaker-cluster-libs pacemaker-libs pacemaker-schemas"


URI_pacemaker-cluster-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-cluster-libs-3.0.0-5.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pacemaker-cluster-libs = " \
 libqb \
 libuuid \
 libxslt \
 gnutls \
 bzip2-libs \
 corosynclib \
 pacemaker-libs \
 libxml2 \
 glib2 \
 glibc \
 dbus-libs \
"

URI_pacemaker-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-libs-3.0.0-5.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pacemaker-libs = " \
 libqb \
 libuuid \
 shadow-utils \
 libxslt \
 gnutls \
 bzip2-libs \
 pacemaker-schemas \
 libxml2 \
 bash \
 glib2 \
 glibc \
 dbus-libs \
"

URI_pacemaker-schemas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-schemas-3.0.0-5.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:pacemaker-schemas = " \
 pkgconf-pkg-config \
"
