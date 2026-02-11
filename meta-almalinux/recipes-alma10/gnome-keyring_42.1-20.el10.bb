
PN = "gnome-keyring"
PE = "0"
PV = "42.1"
PR = "20.el10"
PACKAGES = "gnome-keyring gnome-keyring-pam"


URI_gnome-keyring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-keyring-42.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-keyring = " \
 gcr3 \
 gcr3-base \
 systemd-libs \
 openssh-clients \
 libgcrypt \
 bash \
 glib2 \
 glibc \
"

URI_gnome-keyring-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-keyring-pam-42.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-keyring-pam = " \
 pam \
 pam-libs \
 gnome-keyring \
 glibc \
 libselinux \
"
