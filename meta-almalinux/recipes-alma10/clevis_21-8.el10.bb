
inherit dnf-bridge

PN = "clevis"
PE = "0"
PV = "21"
PR = "8.el10"
PACKAGES = "clevis clevis-dracut clevis-luks clevis-pin-pkcs11 clevis-systemd clevis-udisks2"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/clevis-21-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_clevis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis}"
RDEPENDS:clevis = " \
 shadow-utils \
 systemd \
 jansson \
 libgcc \
 openssl-libs \
 curl \
 jq \
 bash \
 clevis-pin-tpm2 \
 tpm2-tools \
 glibc \
 coreutils \
 libjose \
 jose \
"

URI_clevis-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-dracut-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-dracut}"
RDEPENDS:clevis-dracut = " \
 dracut-network \
 bash \
 clevis-systemd \
"

URI_clevis-luks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-luks-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-luks}"
RDEPENDS:clevis-luks = " \
 luksmeta \
 clevis \
 bash \
 cryptsetup \
"

URI_clevis-pin-pkcs11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-pin-pkcs11-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-pin-pkcs11}"
RDEPENDS:clevis-pin-pkcs11 = " \
 opensc \
 openssl \
 clevis-dracut \
 bash \
 clevis-luks \
 pcsc-lite \
 clevis-systemd \
 glibc \
 socat \
"

URI_clevis-systemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-systemd-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-systemd}"
RDEPENDS:clevis-systemd = " \
 systemd \
 bash \
 clevis-luks \
"

URI_clevis-udisks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-udisks2-21-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-udisks2}"
RDEPENDS:clevis-udisks2 = " \
 jansson \
 cryptsetup-libs \
 audit-libs \
 libgcc \
 libluksmeta \
 libudisks2 \
 clevis-luks \
 glib2 \
 glibc \
"
