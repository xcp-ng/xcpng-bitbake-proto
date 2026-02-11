
inherit dnf-bridge

PN = "pavucontrol"
PE = "0"
PV = "6.0"
PR = "5.el10"
PACKAGES = "pavucontrol"


URI_pavucontrol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pavucontrol-6.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pavucontrol = " \
 gtkmm4.0 \
 pulseaudio-libs \
 libgcc \
 pulseaudio-libs-glib2 \
 json-glib \
 libstdc++ \
 glib2 \
 glibmm2.68 \
 glibc \
 gtk4 \
 libsigc++30 \
"
