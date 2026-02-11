
inherit dnf-bridge

PN = "accountsservice"
PE = "0"
PV = "23.13.9"
PR = "6.el10"
PACKAGES = "accountsservice accountsservice-libs accountsservice-devel"


URI_accountsservice = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/accountsservice-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice = " \
 systemd \
 shadow-utils \
 libgcc \
 polkit \
 polkit-libs \
 bash \
 glib2 \
 glibc \
"

URI_accountsservice-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/accountsservice-libs-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice-libs = " \
 systemd-libs \
 accountsservice \
 libxcrypt \
 libgcc \
 glib2 \
 glibc \
"

URI_accountsservice-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/accountsservice-devel-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice-devel = " \
 glib2-devel \
 polkit-devel \
 pkgconf-pkg-config \
 accountsservice-libs \
"
