
PN = "babeltrace"
PE = "0"
PV = "1.5.11"
PR = "9.el10"
PACKAGES = "libbabeltrace libbabeltrace-devel python3-babeltrace babeltrace"


URI_libbabeltrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbabeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbabeltrace = " \
 libuuid \
 elfutils-libelf \
 elfutils-libs \
 glib2 \
 popt \
 glibc \
"

URI_libbabeltrace-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbabeltrace-devel-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbabeltrace-devel = " \
 glib2-devel \
 libbabeltrace \
 pkgconf-pkg-config \
 libuuid-devel \
 popt-devel \
 libbabeltrace-devel \
"

URI_python3-babeltrace = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-babeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-babeltrace = " \
 glibc \
 python3 \
 libbabeltrace \
"

URI_babeltrace = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:babeltrace = " \
 libuuid \
 libbabeltrace \
 popt \
 glib2 \
 glibc \
"
