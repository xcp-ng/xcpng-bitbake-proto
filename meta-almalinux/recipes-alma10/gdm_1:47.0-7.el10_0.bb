
PN = "gdm"
PE = "1"
PV = "47.0"
PR = "7.el10_0"
PACKAGES = "gdm gdm-devel gdm-pam-extensions-devel"


URI_gdm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdm-47.0-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdm = " \
 python3 \
 systemd \
 systemd-libs \
 keyutils-libs \
 libXau \
 libselinux \
 accountsservice \
 accountsservice-libs \
 util-linux \
 json-glib \
 dbus-daemon \
 gnome-keyring-pam \
 dconf \
 almalinux-logos \
 gnome-session \
 gnome-session-wayland-session \
 gnome-settings-daemon \
 shadow-utils \
 gnome-shell \
 python3-pam \
 audit-libs \
 libgcc \
 pam \
 libgudev \
 pam-libs \
 bash \
 glib2 \
 glibc \
 iso-codes \
"

URI_gdm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gdm-devel-47.0-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdm-devel = " \
 glib2-devel \
 systemd-devel \
 pkgconf-pkg-config \
 libselinux-devel \
 gdm \
 gdm-pam-extensions-devel \
"

URI_gdm-pam-extensions-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gdm-pam-extensions-devel-47.0-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdm-pam-extensions-devel = " \
 pam-devel \
 pkgconf-pkg-config \
"
