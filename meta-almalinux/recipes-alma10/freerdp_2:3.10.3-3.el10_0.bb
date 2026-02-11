
PN = "freerdp"
PE = "2"
PV = "3.10.3"
PR = "3.el10_0"
PACKAGES = "freerdp freerdp-libs libwinpr freerdp-devel freerdp-server libwinpr-devel"


URI_freerdp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freerdp-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:freerdp = " \
 libXfixes \
 libXi \
 libwayland-client \
 libXinerama \
 libwayland-cursor \
 freerdp-libs \
 libXrandr \
 libwinpr \
 libX11 \
 libXrender \
 glibc \
 libxkbcommon \
 libXcursor \
 libXext \
"

URI_freerdp-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freerdp-libs-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:freerdp-libs = " \
 cups-libs \
 libX11 \
 libXdamage \
 libXext \
 libXfixes \
 libXinerama \
 libstdc++ \
 cairo \
 libXtst \
 fdk-aac-free \
 libusb1 \
 alsa-lib \
 zlib-ng-compat \
 pulseaudio-libs \
 openssl-libs \
 libgcc \
 libwinpr \
 pam-libs \
 opus \
 libxkbfile \
 lame-libs \
 gsm \
 fuse3-libs \
 glibc \
"

URI_libwinpr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwinpr-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwinpr = " \
 libpng \
 openssl-libs \
 libgcc \
 json-c \
 libwebp \
 krb5-libs \
 libcom_err \
 glibc \
 libicu \
 libjpeg-turbo \
"

URI_freerdp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freerdp-devel-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:freerdp-devel = " \
 cmake-filesystem \
 freerdp-libs \
 zlib-ng-compat-devel \
 freerdp-devel \
 pkgconf-pkg-config \
 cmake \
 libwinpr-devel \
"

URI_freerdp-server = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freerdp-server-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:freerdp-server = " \
 glibc \
 freerdp-libs \
 libwinpr \
"

URI_libwinpr-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwinpr-devel-3.10.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwinpr-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 libwinpr \
 openssl-devel \
 cmake \
 libwinpr-devel \
"
