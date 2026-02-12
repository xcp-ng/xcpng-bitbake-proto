
inherit dnf-bridge

PN = "qemu-kvm"
PE = "18"
PV = "9.1.0"
PR = "15.el10_0.4.alma.1"
PACKAGES = "qemu-guest-agent qemu-img qemu-kvm qemu-kvm-audio-pa qemu-kvm-block-blkio qemu-kvm-block-curl qemu-kvm-block-rbd qemu-kvm-common qemu-kvm-core qemu-kvm-device-display-virtio-gpu qemu-kvm-device-display-virtio-gpu-pci qemu-kvm-device-display-virtio-vga qemu-kvm-device-usb-host qemu-kvm-device-usb-redirect qemu-kvm-docs qemu-kvm-tools qemu-kvm-ui-egl-headless qemu-kvm-ui-opengl qemu-kvm-ui-spice qemu-pr-helper qemu-kvm-audio-dbus qemu-kvm-tests qemu-kvm-ui-dbus"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qemu-kvm-9.1.0-15.el10_0.4.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qemu-guest-agent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-guest-agent-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-guest-agent}"
RDEPENDS:qemu-guest-agent = " \
 systemd \
 systemd-libs \
 numactl-libs \
 libgcc \
 bash \
 glib2 \
 glibc \
 liburing \
"

URI_qemu-img = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-img-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-img}"
RDEPENDS:qemu-img = " \
 zlib-ng-compat \
 libaio \
 gnutls \
 numactl-libs \
 libgcc \
 libzstd \
 glib2 \
 glibc \
 libselinux \
 liburing \
"

URI_qemu-kvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm}"
RDEPENDS:qemu-kvm = " \
 qemu-kvm-core \
 qemu-pr-helper \
 qemu-kvm-device-display-virtio-gpu \
 qemu-kvm-device-display-virtio-gpu-pci \
 qemu-kvm-device-display-virtio-vga \
 qemu-kvm-device-usb-host \
 qemu-kvm-device-usb-redirect \
 virtiofsd \
 qemu-kvm-audio-pa \
 qemu-kvm-docs \
 qemu-kvm-block-blkio \
 qemu-kvm-tools \
 qemu-kvm-ui-egl-headless \
 qemu-kvm-block-rbd \
 qemu-kvm-ui-opengl \
 qemu-kvm-ui-spice \
"

URI_qemu-kvm-audio-pa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-audio-pa-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-audio-pa}"
RDEPENDS:qemu-kvm-audio-pa = " \
 glibc \
 pulseaudio-libs \
 qemu-kvm-common \
"

URI_qemu-kvm-block-blkio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-block-blkio-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-block-blkio}"
RDEPENDS:qemu-kvm-block-blkio = " \
 glibc \
 libblkio \
 libgcc \
 qemu-kvm-common \
"

URI_qemu-kvm-block-curl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-block-curl-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-block-curl}"
RDEPENDS:qemu-kvm-block-curl = " \
 glibc \
 libgcc \
 qemu-kvm-common \
 libcurl \
"

URI_qemu-kvm-block-rbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-block-rbd-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-block-rbd}"
RDEPENDS:qemu-kvm-block-rbd = " \
 librados2 \
 librbd1 \
 libgcc \
 glibc \
 qemu-kvm-common \
"

URI_qemu-kvm-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-common-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-common}"
RDEPENDS:qemu-kvm-common = " \
 glibc-common \
 shadow-utils \
 systemd \
 libgcc \
 libcap-ng \
 bash \
 glib2 \
 glibc \
 ipxe-roms-qemu \
 seabios-bin \
 seavgabios-bin \
"

URI_qemu-kvm-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-core-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-core}"
RDEPENDS:qemu-kvm-core = " \
 libpng \
 cyrus-sasl-lib \
 libseccomp \
 edk2-ovmf \
 libaio \
 numactl-libs \
 qemu-img \
 capstone \
 libfdt \
 qemu-kvm-common \
 liburing \
 libusb1 \
 zlib-ng-compat \
 gnutls \
 libgcc \
 snappy \
 libzstd \
 libslirp \
 pixman \
 lzo \
 glib2 \
 glibc \
"

URI_qemu-kvm-device-display-virtio-gpu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-device-display-virtio-gpu-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-device-display-virtio-gpu}"
RDEPENDS:qemu-kvm-device-display-virtio-gpu = " \
 glibc \
 qemu-kvm-common \
 pixman \
"

URI_qemu-kvm-device-display-virtio-gpu-pci = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-device-display-virtio-gpu-pci-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-device-display-virtio-gpu-pci}"
RDEPENDS:qemu-kvm-device-display-virtio-gpu-pci = " \
 glibc \
 qemu-kvm-device-display-virtio-gpu \
 qemu-kvm-common \
"

URI_qemu-kvm-device-display-virtio-vga = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-device-display-virtio-vga-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-device-display-virtio-vga}"
RDEPENDS:qemu-kvm-device-display-virtio-vga = " \
 glibc \
 qemu-kvm-common \
"

URI_qemu-kvm-device-usb-host = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-device-usb-host-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-device-usb-host}"
RDEPENDS:qemu-kvm-device-usb-host = " \
 glibc \
 qemu-kvm-common \
 libusb1 \
"

URI_qemu-kvm-device-usb-redirect = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-device-usb-redirect-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-device-usb-redirect}"
RDEPENDS:qemu-kvm-device-usb-redirect = " \
 glibc \
 usbredir \
 libgcc \
 qemu-kvm-common \
"

URI_qemu-kvm-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-docs-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-docs}"
RDEPENDS:qemu-kvm-docs = ""

URI_qemu-kvm-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-tools-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-tools}"
RDEPENDS:qemu-kvm-tools = " \
 python3 \
 libgcc \
 glib2 \
 libcurl \
 glibc \
 libxkbcommon \
"

URI_qemu-kvm-ui-egl-headless = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-ui-egl-headless-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-ui-egl-headless}"
RDEPENDS:qemu-kvm-ui-egl-headless = " \
 libepoxy \
 glibc \
 qemu-kvm-ui-opengl \
 qemu-kvm-common \
 pixman \
"

URI_qemu-kvm-ui-opengl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-ui-opengl-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-ui-opengl}"
RDEPENDS:qemu-kvm-ui-opengl = " \
 mesa-dri-drivers \
 libepoxy \
 libgcc \
 mesa-libEGL \
 mesa-libGL \
 mesa-libgbm \
 glibc \
 qemu-kvm-common \
 pixman \
"

URI_qemu-kvm-ui-spice = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-kvm-ui-spice-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-ui-spice}"
RDEPENDS:qemu-kvm-ui-spice = " \
 libgcc \
 spice-server \
 glibc \
 qemu-kvm-ui-opengl \
 qemu-kvm-common \
 pixman \
"

URI_qemu-pr-helper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qemu-pr-helper-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-pr-helper}"
RDEPENDS:qemu-pr-helper = " \
 gnutls \
 systemd-libs \
 numactl-libs \
 device-mapper-multipath-libs \
 libgcc \
 libcap-ng \
 glib2 \
 glibc \
 liburing \
"

URI_qemu-kvm-audio-dbus = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qemu-kvm-audio-dbus-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-audio-dbus}"
RDEPENDS:qemu-kvm-audio-dbus = " \
 libgcc \
 glib2 \
 qemu-kvm-ui-dbus \
 glibc \
 qemu-kvm-common \
"

URI_qemu-kvm-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qemu-kvm-tests-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-tests}"
RDEPENDS:qemu-kvm-tests = " \
 glibc \
 bash \
 python3 \
 qemu-kvm \
"

URI_qemu-kvm-ui-dbus = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qemu-kvm-ui-dbus-9.1.0-15.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qemu-kvm-ui-dbus}"
RDEPENDS:qemu-kvm-ui-dbus = " \
 libepoxy \
 libgcc \
 glib2 \
 glibc \
 qemu-kvm-common \
 pixman \
"
