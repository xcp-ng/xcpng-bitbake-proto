
inherit dnf-bridge

PN = "kernelshark"
PE = "1"
PV = "2.3.1"
PR = "4.el10"
PACKAGES = "kernelshark"


URI_kernelshark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernelshark-2.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernelshark = " \
 libtracecmd-devel \
 qt6-qtscxml \
 freeglut \
 json-c \
 libstdc++ \
 libtracecmd \
 libtraceevent \
 libtracefs \
 json-c-devel \
 libglvnd-glx \
 libgcc \
 mesa-libGLU \
 bash \
 google-noto-sans-fonts \
 pkgconf-pkg-config \
 qt6-qtbase \
 polkit \
 qt6-qtbase-gui \
 glibc \
"
