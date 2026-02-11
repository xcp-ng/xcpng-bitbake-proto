
PN = "gstreamer1-plugins-bad-free"
PE = "0"
PV = "1.24.11"
PR = "2.el10_0"
PACKAGES = "gstreamer1-plugins-bad-free gstreamer1-plugins-bad-free-libs gstreamer1-plugins-bad-free-devel"


URI_gstreamer1-plugins-bad-free = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-bad-free-1.24.11-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-bad-free = "
 liblc3
 lcms2
 pango
 libva
 libdrm
 libdvdnav
 libdvdread
 json-glib
 libstdc++
 cairo
 fdk-aac-free
 libusb1
 soundtouch
 libwayland-client
 librsvg2
 openssl-libs
 libgcc
 libxml2
 libwebp
 libgudev
 vulkan-loader
 opus
 libsndfile
 orc
 bzip2-libs
 gsm
 gstreamer1
 webrtc-audio-processing
 gstreamer1-plugins-bad-free-libs
 gstreamer1-plugins-base
 libsrtp
 glib2
 gtk3
 glibc
"

URI_gstreamer1-plugins-bad-free-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-bad-free-libs-1.24.11-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-bad-free-libs = "
 libwayland-client
 gstreamer1
 libgcc
 gstreamer1-plugins-base
 libstdc++
 glib2
 glibc
 libva
 vulkan-loader
 libdrm
"

URI_gstreamer1-plugins-bad-free-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gstreamer1-plugins-bad-free-devel-1.24.11-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-bad-free-devel = "
 wayland-devel
 glib2-devel
 gstreamer1-plugins-bad-free-devel
 gstreamer1-devel
 gstreamer1-plugins-bad-free
 gstreamer1-plugins-bad-free-libs
 pkgconf-pkg-config
 gstreamer1-plugins-base-devel
 libva-devel
 vulkan-loader-devel
 libdrm-devel
"
