
PN = "NetworkManager"
PE = "1"
PV = "1.52.0"
PR = "8.el10_0"
PACKAGES = "NetworkManager NetworkManager-adsl NetworkManager-bluetooth NetworkManager-config-server NetworkManager-libnm NetworkManager-tui NetworkManager-wifi NetworkManager-wwan NetworkManager-cloud-setup NetworkManager-config-connectivity-redhat NetworkManager-ovs NetworkManager-ppp NetworkManager-libnm-devel"


URI_NetworkManager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager = " \
 systemd \
 systemd-libs \
 gnutls \
 systemd-udev \
 libgcc \
 readline \
 audit-libs \
 libndp \
 libselinux \
 bash \
 glib2 \
 dbus \
 libcurl \
 glibc \
 alternatives \
 NetworkManager-libnm \
"

URI_NetworkManager-adsl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-adsl-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-adsl = " \
 glibc \
 NetworkManager \
 libgcc \
 glib2 \
"

URI_NetworkManager-bluetooth = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-bluetooth-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-bluetooth = " \
 NetworkManager \
 NetworkManager-wwan \
 libgcc \
 glib2 \
 glibc \
 bluez \
 bluez-libs \
"

URI_NetworkManager-config-server = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-config-server-1.52.0-8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:NetworkManager-config-server = ""

URI_NetworkManager-libnm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-libnm-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-libnm = " \
 gnutls \
 systemd-libs \
 libgcc \
 glib2 \
 glibc \
"

URI_NetworkManager-tui = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-tui-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-tui = " \
 newt \
 NetworkManager \
 libgcc \
 glib2 \
 glibc \
 NetworkManager-libnm \
"

URI_NetworkManager-wifi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-wifi-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-wifi = " \
 NetworkManager \
 libgcc \
 glib2 \
 wireless-regdb \
 glibc \
 wpa_supplicant \
"

URI_NetworkManager-wwan = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/NetworkManager-wwan-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-wwan = " \
 ModemManager \
 ModemManager-glib \
 systemd-libs \
 NetworkManager \
 libgcc \
 glib2 \
 glibc \
"

URI_NetworkManager-cloud-setup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-cloud-setup-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-cloud-setup = " \
 jansson \
 NetworkManager \
 libgcc \
 bash \
 glib2 \
 libcurl \
 glibc \
 NetworkManager-libnm \
"

URI_NetworkManager-config-connectivity-redhat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-config-connectivity-redhat-1.52.0-8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:NetworkManager-config-connectivity-redhat = ""

URI_NetworkManager-ovs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-ovs-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-ovs = " \
 NetworkManager \
 jansson \
 libgcc \
 glib2 \
 glibc \
"

URI_NetworkManager-ppp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-ppp-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-ppp = " \
 NetworkManager \
 libgcc \
 glib2 \
 ppp \
 glibc \
"

URI_NetworkManager-libnm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/NetworkManager-libnm-devel-1.52.0-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-libnm-devel = " \
 glib2-devel \
 NetworkManager-libnm \
 pkgconf-pkg-config \
"
