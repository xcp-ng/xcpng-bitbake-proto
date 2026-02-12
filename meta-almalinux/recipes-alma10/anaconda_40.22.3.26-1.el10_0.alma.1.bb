
inherit dnf-bridge

PN = "anaconda"
PE = "0"
PV = "40.22.3.26"
PR = "1.el10_0.alma.1"
PACKAGES = "anaconda anaconda-core anaconda-dracut anaconda-gui anaconda-install-env-deps anaconda-install-img-deps anaconda-tui anaconda-widgets anaconda-widgets-devel anaconda-live"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/anaconda-40.22.3.26-1.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_anaconda = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda}"
RDEPENDS:anaconda = " \
 anaconda-gui \
 anaconda-tui \
"

URI_anaconda-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-core-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-core}"
RDEPENDS:anaconda-core = " \
 python3 \
 flatpak-libs \
 systemd \
 crypto-policies \
 crypto-policies-scripts \
 NetworkManager \
 python3-dnf \
 python3-gobject-base \
 NetworkManager-libnm \
 python3-kickstart \
 python3-langtable \
 util-linux \
 python3-requests-ftp \
 python3-libselinux \
 python3-libs \
 kbd \
 glibc-langpack-en \
 dbus-daemon \
 python3-meh \
 python3-requests \
 python3-rpm \
 bash \
 python3-systemd \
 anaconda-tui \
 python3-pid \
 python3-productmd \
 python3-blivet \
 python3-blockdev \
 python3-pwquality \
 chrony \
 python3-pyparted \
 python3-dasbus \
 python3-requests-file \
 coreutils \
 cracklib-dicts \
"

URI_anaconda-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-dracut-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-dracut}"
RDEPENDS:anaconda-dracut = " \
 python3 \
 libarchive \
 dnsconfd \
 dnsconfd-dracut \
 dracut-live \
 iputils \
 python3-kickstart \
 bash \
 dracut \
 xz \
 glibc \
 rpm-libs \
 dracut-network \
"

URI_anaconda-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-gui-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-gui}"
RDEPENDS:anaconda-gui = " \
 python3 \
 nm-connection-editor \
 tecla \
 NetworkManager-wifi \
 adwaita-icon-theme \
 python3-iso639 \
 anaconda-core \
 anaconda-widgets \
 almalinux-logos \
 python3-meh-gui \
 python3-xkbregistry \
"

URI_anaconda-install-env-deps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-install-env-deps-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-install-env-deps}"
RDEPENDS:anaconda-install-env-deps = " \
 isomd5sum \
 e2fsprogs \
 rsync \
 gdb \
 kexec-tools \
 realmd \
 libblockdev-plugins-all \
 dosfstools \
 tmux \
 xfsprogs \
 udisks2-iscsi \
"

URI_anaconda-install-img-deps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-install-img-deps-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-install-img-deps}"
RDEPENDS:anaconda-install-img-deps = " \
 dnsconfd \
 dnsconfd-dracut \
 createrepo_c \
 brltty \
 device-mapper-multipath \
 nvme-cli \
 skopeo \
 gnome-kiosk \
 gnome-remote-desktop \
 python3-pam \
 mesa-dri-drivers \
 openssl \
 librsvg2 \
 kdump-anaconda-addon \
 zram-generator \
 rpm-ostree \
 anaconda-install-env-deps \
 fcoe-utils \
 nm-connection-editor \
 gsettings-desktop-schemas \
 ostree \
"

URI_anaconda-tui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-tui-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-tui}"
RDEPENDS:anaconda-tui = " \
 python3 \
 python3-simpleline \
 anaconda-core \
"

URI_anaconda-widgets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-widgets-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-widgets}"
RDEPENDS:anaconda-widgets = " \
 python3 \
 atk \
 cairo-gobject \
 libgcc \
 harfbuzz \
 pango \
 gdk-pixbuf2 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"

URI_anaconda-widgets-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/anaconda-widgets-devel-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anaconda-widgets-devel}"
RDEPENDS:anaconda-widgets-devel = " \
 anaconda-widgets \
"

URI_anaconda-live = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/anaconda-live-40.22.3.26-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_anaconda-live}"
RDEPENDS:anaconda-live = " \
 anaconda-gui \
 zenity \
 bash \
 usermode \
"
