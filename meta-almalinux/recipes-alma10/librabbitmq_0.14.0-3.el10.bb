
inherit dnf-bridge

PN = "librabbitmq"
PE = "0"
PV = "0.14.0"
PR = "3.el10"
PACKAGES = "librabbitmq librabbitmq-tools librabbitmq-devel"


URI_librabbitmq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librabbitmq-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq = " \
 glibc \
 openssl-libs \
"

URI_librabbitmq-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librabbitmq-tools-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq-tools = " \
 glibc \
 librabbitmq \
 popt \
"

URI_librabbitmq-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librabbitmq-devel-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq-devel = " \
 librabbitmq \
 cmake-filesystem \
 pkgconf-pkg-config \
"
