
PN = "cockpit"
PE = "0"
PV = "334.1"
PR = "1.el10_0"
PACKAGES = "cockpit cockpit-bridge cockpit-doc cockpit-system cockpit-ws cockpit-packagekit cockpit-storaged"


URI_cockpit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit = " \
 cockpit-ws \
 cockpit-bridge \
 cockpit-system \
"

URI_cockpit-bridge = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-bridge-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit-bridge = " \
 python3 \
"

URI_cockpit-doc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-doc-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-doc = ""

URI_cockpit-system = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-system-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-system = " \
 shadow-utils \
 NetworkManager \
 libpwquality \
 sos \
 grep \
 cockpit-bridge \
 coreutils \
 sudo \
"

URI_cockpit-ws = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-ws-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit-ws = " \
 systemd-libs \
 gnutls \
 libxcrypt \
 openssl \
 libgcc \
 json-glib \
 policycoreutils \
 pam-libs \
 krb5-libs \
 glib-networking \
 bash \
 glib2 \
 glibc \
 selinux-policy \
"

URI_cockpit-packagekit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-packagekit-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-packagekit = " \
 polkit \
 cockpit-bridge \
 PackageKit \
"

URI_cockpit-storaged = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-storaged-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-storaged = " \
 python3 \
 python3-dbus \
 bash \
 cockpit-system \
 udisks2 \
"
