
inherit dnf-bridge

PN = "pipewire"
PE = "0"
PV = "1.2.7"
PR = "1.el10"
PACKAGES = "pipewire pipewire-alsa pipewire-devel pipewire-gstreamer pipewire-jack-audio-connection-kit pipewire-jack-audio-connection-kit-devel pipewire-jack-audio-connection-kit-libs pipewire-libs pipewire-module-x11 pipewire-plugin-libcamera pipewire-pulseaudio pipewire-utils pipewire-doc pipewire-plugin-vulkan pipewire-v4l2"


URI_pipewire = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire = " \
 shadow-utils \
 systemd \
 wireplumber \
 bash \
 rtkit \
 glibc \
 pipewire-libs \
"

URI_pipewire-alsa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-alsa-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-alsa = " \
 glibc \
 pipewire-libs \
 alsa-lib \
"

URI_pipewire-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-devel-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-devel = " \
 pipewire-libs \
 pipewire-devel \
 pkgconf-pkg-config \
"

URI_pipewire-gstreamer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-gstreamer-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-gstreamer = " \
 gstreamer1 \
 libgcc \
 gstreamer1-plugins-base \
 glib2 \
 glibc \
 pipewire-libs \
"

URI_pipewire-jack-audio-connection-kit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-jack-audio-connection-kit-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-jack-audio-connection-kit = " \
 pipewire-jack-audio-connection-kit-libs \
"

URI_pipewire-jack-audio-connection-kit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-jack-audio-connection-kit-devel-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-jack-audio-connection-kit-devel = " \
 pipewire-jack-audio-connection-kit-libs \
 pkgconf-pkg-config \
"

URI_pipewire-jack-audio-connection-kit-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-jack-audio-connection-kit-libs-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-jack-audio-connection-kit-libs = " \
 glibc \
 pipewire-libs \
 bash \
 pipewire-jack-audio-connection-kit \
"

URI_pipewire-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-libs-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-libs = " \
 liblc3 \
 libldac \
 systemd-libs \
 dbus-libs \
 libselinux \
 libstdc++ \
 fdk-aac-free \
 libusb1 \
 alsa-lib \
 pulseaudio-libs \
 openssl-libs \
 libgcc \
 libsbc \
 avahi-libs \
 bluez-libs \
 opus \
 libsndfile \
 webrtc-audio-processing \
 glib2 \
 glibc \
"

URI_pipewire-module-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-module-x11-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-module-x11 = " \
 libXfixes \
 libcanberra \
 libX11 \
 glibc \
 pipewire-libs \
"

URI_pipewire-plugin-libcamera = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-plugin-libcamera-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-plugin-libcamera = " \
 libcamera \
 libgcc \
 libstdc++ \
 glibc \
 pipewire-libs \
 libdrm \
"

URI_pipewire-pulseaudio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-pulseaudio-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-pulseaudio = " \
 systemd-libs \
 libgcc \
 avahi-libs \
 bash \
 glib2 \
 glibc \
 pipewire-libs \
 dbus-libs \
"

URI_pipewire-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pipewire-utils-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-utils = " \
 alsa-lib \
 libgcc \
 readline \
 pipewire \
 ncurses-libs \
 glibc \
 pipewire-libs \
 dbus-libs \
 libsndfile \
"

URI_pipewire-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pipewire-doc-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-doc = ""

URI_pipewire-plugin-vulkan = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pipewire-plugin-vulkan-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-plugin-vulkan = " \
 glibc \
 pipewire-libs \
 vulkan-loader \
 libdrm \
"

URI_pipewire-v4l2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pipewire-v4l2-1.2.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pipewire-v4l2 = " \
 glibc \
 pipewire-libs \
 bash \
"
