
inherit dnf-bridge

PN = "policycoreutils"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "policycoreutils policycoreutils-newrole policycoreutils-restorecond policycoreutils-dbus policycoreutils-devel policycoreutils-gui policycoreutils-python-utils policycoreutils-sandbox python3-policycoreutils"


URI_policycoreutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils = " \
 util-linux \
 audit-libs \
 gawk \
 diffutils \
 grep \
 libselinux-utils \
 libselinux \
 bash \
 glibc \
 coreutils \
 sed \
 rpm \
 libsemanage \
 libsepol \
"

URI_policycoreutils-newrole = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-newrole-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-newrole = " \
 audit-libs \
 libcap-ng \
 pam-libs \
 policycoreutils \
 glibc \
 libselinux \
"

URI_policycoreutils-restorecond = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-restorecond-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-restorecond = " \
 glibc \
 libselinux \
 bash \
 glib2 \
"

URI_policycoreutils-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-dbus-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-dbus = " \
 python3 \
 polkit \
 python3-gobject-base \
 python3-policycoreutils \
"

URI_policycoreutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-devel-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-devel = " \
 python3 \
 selinux-policy-devel \
 policycoreutils-python-utils \
 make \
 python3-dnf \
 glibc \
 libselinux \
"

URI_policycoreutils-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-gui-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-gui = " \
 python3 \
 python3-policycoreutils \
 python3-gobject \
 policycoreutils-dbus \
 policycoreutils-devel \
 bash \
 gtk3 \
"

URI_policycoreutils-python-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-python-utils-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-python-utils = " \
 python3 \
 python3-policycoreutils \
"

URI_policycoreutils-sandbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-sandbox-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-sandbox = " \
 python3 \
 python3-policycoreutils \
 rsync \
 libcap-ng \
 bash \
 glibc \
 libselinux \
"

URI_python3-policycoreutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-policycoreutils-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-policycoreutils = " \
 python3 \
 checkpolicy \
 python3-libselinux \
 policycoreutils \
 python3-libsemanage \
 python3-setools \
 python3-distro \
 python3-audit \
"
