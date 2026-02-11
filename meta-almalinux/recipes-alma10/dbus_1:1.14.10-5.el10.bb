
PN = "dbus"
PE = "1"
PV = "1.14.10"
PR = "5.el10"
PACKAGES = "dbus dbus-common dbus-libs dbus-tools dbus-daemon dbus-devel dbus-x11 dbus-doc dbus-tests"


URI_dbus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dbus-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus = " \
 dbus-broker \
"

URI_dbus-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dbus-common-1.14.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:dbus-common = " \
 bash \
"

URI_dbus-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dbus-libs-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-libs = " \
 glibc \
 systemd-libs \
"

URI_dbus-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dbus-tools-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-tools = " \
 glibc \
 dbus-libs \
"

URI_dbus-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dbus-daemon-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-daemon = " \
 dbus-tools \
 shadow-utils \
 systemd-libs \
 audit-libs \
 libcap-ng \
 bash \
 expat \
 glibc \
 libselinux \
 dbus-libs \
 dbus-common \
"

URI_dbus-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dbus-devel-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-devel = " \
 dbus-libs \
 cmake-filesystem \
 pkgconf-pkg-config \
 xml-common \
"

URI_dbus-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dbus-x11-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-x11 = " \
 libX11 \
 dbus-daemon \
 bash \
 glibc \
 dbus-libs \
"

URI_dbus-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dbus-doc-1.14.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:dbus-doc = " \
 dbus-daemon \
"

URI_dbus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dbus-tests-1.14.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-tests = " \
 systemd-libs \
 dbus-daemon \
 bash \
 glib2 \
 glibc \
 dbus-libs \
"
