
PN = "usbguard"
PE = "0"
PV = "1.1.3"
PR = "6.el10"
PACKAGES = "usbguard usbguard-dbus usbguard-notifier usbguard-selinux usbguard-tools usbguard-devel"


URI_usbguard = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard = " \
 libqb \
 protobuf \
 systemd \
 audit-libs \
 libgcc \
 openssl-libs \
 libcap-ng \
 libstdc++ \
 bash \
 glibc \
"

URI_usbguard-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-dbus-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-dbus = " \
 usbguard \
 libgcc \
 polkit \
 libstdc++ \
 bash \
 glib2 \
 polkit-libs \
 dbus \
 glibc \
"

URI_usbguard-notifier = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-notifier-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-notifier = " \
 systemd \
 usbguard \
 librsvg2 \
 libgcc \
 libstdc++ \
 bash \
 glib2 \
 glibc \
 libnotify \
"

URI_usbguard-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-selinux-1.1.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:usbguard-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_usbguard-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-tools-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-tools = " \
 glibc \
 libgcc \
 libstdc++ \
 usbguard \
"

URI_usbguard-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/usbguard-devel-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-devel = " \
 usbguard \
 pkgconf-pkg-config \
 libstdc++-devel \
"
