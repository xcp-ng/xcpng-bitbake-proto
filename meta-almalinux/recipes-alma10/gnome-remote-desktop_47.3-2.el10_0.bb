
inherit dnf-bridge

PN = "gnome-remote-desktop"
PE = "0"
PV = "47.3"
PR = "2.el10_0"
PACKAGES = "gnome-remote-desktop"


URI_gnome-remote-desktop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-remote-desktop-47.3-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-remote-desktop = " \
 systemd-libs \
 tpm2-tss \
 libnotify \
 libei \
 freerdp-libs \
 libepoxy \
 cairo \
 fdk-aac-free \
 libgcc \
 libwinpr \
 libsecret \
 pipewire \
 bash \
 pipewire-libs \
 libxkbcommon \
 opus \
 fuse3-libs \
 polkit-libs \
 glib2 \
 glibc \
"
